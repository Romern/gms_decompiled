package p000;

import com.google.android.gms.backup.BackUpNowConfig;
import com.google.android.gms.backup.settings.component.BackUpNowApiChimeraService;

/* renamed from: mua */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mua extends moh implements aaai {

    /* renamed from: a */
    public static final /* synthetic */ int f34733a = 0;

    /* renamed from: b */
    private static final lvn f34734b = new lvn("BackUpNowApiStub");

    /* renamed from: c */
    private final BackUpNowApiChimeraService f34735c;

    /* renamed from: d */
    private final aaag f34736d;

    /* renamed from: e */
    private final muh f34737e;

    public mua(BackUpNowApiChimeraService backUpNowApiChimeraService, aaag aaag, muh muh) {
        this.f34735c = backUpNowApiChimeraService;
        this.f34736d = aaag;
        this.f34737e = muh;
    }

    /* renamed from: a */
    public final void mo20215a(String str) {
        this.f34737e.mo20253a(str);
    }

    /* renamed from: a */
    public final void mo20216a(String str, lud lud) {
        this.f34737e.mo20254a(str, lud);
    }

    /* renamed from: a */
    public final void mo20217a(mof mof, BackUpNowConfig backUpNowConfig) {
        bmvz bmvz;
        bmvz bmvz2;
        if (this.f34737e.mo20256c() == 0) {
            aaag aaag = this.f34736d;
            BackUpNowApiChimeraService backUpNowApiChimeraService = this.f34735c;
            muh muh = this.f34737e;
            mtz mtz = mtz.f34732a;
            muc muc = new muc(new qws(this.f34735c, "ANDROID_BACKUP", null));
            if (lwb.m24518a(this.f34735c).mo19689a()) {
                bmvz = bmxv.m108566b(lwe.m24540a(this.f34735c));
            } else {
                bmvz = bmvz.f131120a;
            }
            boolean z = backUpNowConfig.f28983f;
            if (lwb.m24518a(this.f34735c).mo19689a() && myh.m25748a() && z) {
                bmvz2 = bmxv.m108566b(new mui(this.f34735c));
            } else {
                bmvz2 = bmvz.f131120a;
            }
            aaag.mo16659a(backUpNowApiChimeraService, new mug(mof, backUpNowConfig, muh, mtz, muc, bmvz, bmvz2));
            return;
        }
        f34734b.mo25409a("BackUpNow operation is already running, not starting a new one.", new Object[0]);
    }

    /* renamed from: a */
    public final boolean mo20218a() {
        return this.f34737e.mo20256c() > 0;
    }
}
