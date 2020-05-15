package p000;

import com.google.android.gms.nearby.connection.PayloadTransferUpdate;
import java.util.List;

/* renamed from: ahqk */
final /* synthetic */ class ahqk implements Runnable {

    /* renamed from: a */
    private final ahra f67789a;

    /* renamed from: b */
    private final buut f67790b;

    /* renamed from: c */
    private final bvih f67791c;

    /* renamed from: d */
    private final long f67792d;

    /* renamed from: e */
    private final List f67793e;

    /* renamed from: f */
    private final ahkv f67794f;

    public ahqk(ahra ahra, buut buut, bvih bvih, long j, List list, ahkv ahkv) {
        this.f67789a = ahra;
        this.f67790b = buut;
        this.f67791c = bvih;
        this.f67792d = j;
        this.f67793e = list;
        this.f67794f = ahkv;
    }

    public final void run() {
        ahra ahra = this.f67789a;
        buut buut = this.f67790b;
        bvih bvih = this.f67791c;
        long j = this.f67792d;
        List<String> list = this.f67793e;
        ahkv ahkv = this.f67794f;
        ahqy a = ahra.f67855d.mo36987a(buut.f154982b);
        if (a != null) {
            ahis ahis = new ahis();
            ahis.mo36542b(buut.f154982b);
            ahis.mo36540a(ahra.m56389a(bvih));
            ahis.mo36543c(buut.f154984d);
            ahis.mo36541a(j);
            PayloadTransferUpdate payloadTransferUpdate = ahis.f67256a;
            for (String str : list) {
                if (a.mo36979a(str) != null) {
                    ahkv.mo36696a(str, payloadTransferUpdate);
                    ahkv.f67390f.mo36658a(str, buut.f154982b, bvih);
                }
            }
            a.mo36982a(list);
            if (a.mo36984c().isEmpty()) {
                a.mo36985d();
                ahra.f67855d.mo36990b(buut.f154982b);
            }
        }
    }
}
