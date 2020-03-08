
public class RentalVideoFee {
    // レンタル日数
    final int _days;
    // 新作フラグ
    final boolean _isNew;
    // 作品名
    final String _videoName;

    public RentalVideoFee(String videoName, int days, boolean isNew){
        _videoName = videoName;
        _isNew = isNew;
        _days = days;
    }

    void calcFee() {
        printVideoInformation();
        System.out.println("レンタル料金は " + totalFee() + "円です。");
    }

    int totalFee() {
        return baseDailyFee() * _days + additionalLongTermFee();
    }

    int additionalLongTermFee() {
        if (_days >= 7) {
            return 100;
        } else {
            return 0;
        }
    }

    int baseDailyFee() {
        if (_isNew) {
            return 250;
        } else {
            return 100;
        }
    }

    void printVideoInformation() {
        System.out.println("映画名:" + _videoName);
        System.out.println("レンタル期間:" + _days + "日");
        System.out.println("種類:" + (_isNew ? "新作": "旧作"));
    }
}
