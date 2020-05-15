package p000;

import com.google.android.gms.backup.d2d.component.MigrateCleaner;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: mno */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mno {

    /* renamed from: a */
    private final qws f34043a;

    public mno(qws qws) {
        this.f34043a = qws;
    }

    /* renamed from: a */
    public static mno m25371a(MigrateCleaner migrateCleaner) {
        return new mno(new qws(migrateCleaner, "ANDROID_BACKUP", null));
    }

    /* renamed from: a */
    public final void mo20185a(int i) {
        bxvd a = lyu.m24685a();
        bxvd da = mru.f34488c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        mru mru = (mru) da.f164949b;
        mru.f34491b = i - 1;
        mru.f34490a |= 1;
        if (a.f164950c) {
            a.mo74035c();
            a.f164950c = false;
        }
        mqk mqk = (mqk) a.f164949b;
        mru mru2 = (mru) da.mo74062i();
        mqk mqk2 = mqk.f34276G;
        mru2.getClass();
        mqk.f34305v = mru2;
        mqk.f34284a |= 67108864;
        mqj mqj = mqj.MIGRATE_CLEANER_ERROR;
        if (cckw.f179263a.mo6606a().mo76258w()) {
            int g = (int) ccnf.m130738g();
            if (a.f164950c) {
                a.mo74035c();
                a.f164950c = false;
            }
            mqk mqk3 = (mqk) a.f164949b;
            mqk3.f34284a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
            mqk3.f34304u = g;
            qwo a2 = this.f34043a.mo24335a(((mqk) a.mo74062i()).serializeToBytes());
            a2.mo24328b(mqj.f34275R);
            a2.mo24327b();
        }
    }
}
