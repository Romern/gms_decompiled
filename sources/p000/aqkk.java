package p000;

import android.content.Context;
import android.os.SystemClock;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: aqkk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqkk {

    /* renamed from: a */
    public static final sek f86279a = new sek("SetupServices", "MetricsHelper");

    /* renamed from: b */
    public final Context f86280b;

    /* renamed from: c */
    public final aqkh f86281c;

    /* renamed from: d */
    public final aqkj f86282d;

    /* renamed from: e */
    public final aqkl f86283e;

    /* renamed from: f */
    public boolean f86284f = false;

    /* renamed from: g */
    public final bxvd f86285g;

    /* renamed from: h */
    public final bxvd f86286h = boco.f132581g.mo74144da();

    public aqkk(Context context, aqkh aqkh, aqkj aqkj, aqkl aqkl) {
        byte[] byteArray;
        this.f86280b = context;
        this.f86281c = aqkh;
        this.f86282d = aqkj;
        this.f86283e = aqkl;
        this.f86285g = boct.f132600I.mo74144da();
        if (this.f86281c.mo47933f().containsKey("MetricsHelper.event") && (byteArray = this.f86281c.mo47933f().getByteArray("MetricsHelper.event")) != null && byteArray.length > 0) {
            try {
                this.f86285g.mo73635b(byteArray, bxus.m123744c());
            } catch (bxwf e) {
                f86279a.mo25410a((Throwable) e);
            }
        }
        bxvd bxvd = this.f86286h;
        boco boco = ((boct) this.f86285g.f164949b).f132623n;
        bxvd.mo73625a((bxvk) (boco == null ? boco.f132581g : boco));
    }

    /* renamed from: a */
    public final void mo47934a() {
        long j = this.f86281c.mo47933f().getLong("MetricsHelper.last_resume_time", -1);
        if (j != -1) {
            long j2 = this.f86281c.mo47933f().getLong("MetricsHelper.foreground_duration", 0) + (SystemClock.elapsedRealtime() - j);
            this.f86281c.mo47933f().putLong("MetricsHelper.foreground_duration", j2);
            this.f86281c.mo47933f().remove("MetricsHelper.last_resume_time");
            bxvd bxvd = this.f86286h;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            boco boco = (boco) bxvd.f164949b;
            boco boco2 = boco.f132581g;
            boco.f132583a |= 4;
            boco.f132586d = j2;
        }
        bxvd bxvd2 = this.f86285g;
        boco boco3 = (boco) this.f86286h.mo74062i();
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        boct boct = (boct) bxvd2.f164949b;
        boct boct2 = boct.f132600I;
        boco3.getClass();
        boct.f132623n = boco3;
        boct.f132610a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
        this.f86281c.mo47933f().putByteArray("MetricsHelper.event", ((boct) this.f86285g.mo74062i()).mo73642k());
    }
}
