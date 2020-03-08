
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
        // 映画の情報を出力
        System.out.println("映画名:" + _videoName);
        System.out.println("レンタル期間:" + _days + "日");
        System.out.println("種類:" + (_isNew ? "新作": "旧作"));

        // 計算料金を置いておく変数、基本料金は一日100円、新作の場合は基本料金は250円
        int tmp = (_isNew ? 250: 100);
        // レンタル日数分の料金計算
        tmp = tmp * _days;
        // 1週間以上のレンタルは長期料金の100円を加算
        tmp = tmp + (_days >= 7 ? 100: 0);
        // レンタル料金を出力する
        System.out.println("レンタル料金は " + tmp + "円です。");
    }
}
