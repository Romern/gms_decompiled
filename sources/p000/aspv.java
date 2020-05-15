package p000;

import com.google.android.gms.tapandpay.firstparty.CardInfo;
import java.util.Comparator;
import java.util.Map;

/* renamed from: aspv */
final /* synthetic */ class aspv implements Comparator {

    /* renamed from: a */
    private final Map f89365a;

    public aspv(Map map) {
        this.f89365a = map;
    }

    public final int compare(Object obj, Object obj2) {
        Map map = this.f89365a;
        srn srn = asqc.f89375a;
        return (((Long) map.get(((CardInfo) obj).f108338E)).longValue() > ((Long) map.get(((CardInfo) obj2).f108338E)).longValue() ? 1 : (((Long) map.get(((CardInfo) obj).f108338E)).longValue() == ((Long) map.get(((CardInfo) obj2).f108338E)).longValue() ? 0 : -1));
    }
}
