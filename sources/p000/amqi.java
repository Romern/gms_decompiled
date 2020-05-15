package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;

/* renamed from: amqi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amqi extends aaab {

    /* renamed from: a */
    private final amvj f75745a;

    /* renamed from: b */
    private final alss f75746b;

    /* renamed from: c */
    private final String f75747c;

    /* renamed from: d */
    private final String f75748d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public amqi(alss alss, Context context, String str, String str2) {
        super(208, "OptInBackupAndSync");
        amvj a = amvj.m63368a(context);
        this.f75745a = a;
        this.f75747c = str;
        this.f75746b = alss;
        this.f75748d = str2;
    }

    /* renamed from: a */
    private static void m63173a(bxvd bxvd) {
        almk.m61263a().mo40515a((amkw) bxvd.mo74062i());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        bxvd da = amkw.f75120e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        amkw amkw = (amkw) da.f164949b;
        int i = 1;
        amkw.f75123b = 1;
        amkw.f75122a |= 1;
        int b = amqf.m63166b(this.f75748d);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        amkw amkw2 = (amkw) da.f164949b;
        int i2 = b - 1;
        if (b != 0) {
            amkw2.f75125d = i2;
            amkw2.f75122a |= 4;
            boolean b2 = cfxe.m143363b();
            if (amqf.m63165a(this.f75748d)) {
                try {
                    this.f75745a.mo41376a(this.f75747c);
                    if (b2) {
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        amkw amkw3 = (amkw) da.f164949b;
                        amkw3.f75124c = 1;
                        amkw3.f75122a |= 2;
                        m63173a(da);
                    }
                    da.mo74062i();
                    this.f75746b.mo40721a(Status.f30107a);
                } catch (aaaj e) {
                    if (b2) {
                        if (e.f27843a.f30115i == 4) {
                            i = 4;
                        }
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        amkw amkw4 = (amkw) da.f164949b;
                        amkw4.f75124c = i - 1;
                        amkw4.f75122a |= 2;
                        m63173a(da);
                    }
                    throw e;
                } catch (Throwable th) {
                    da.mo74062i();
                    throw th;
                }
            } else {
                if (b2) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    amkw amkw5 = (amkw) da.f164949b;
                    amkw5.f75124c = 0;
                    amkw5.f75122a |= 2;
                    m63173a(da);
                }
                throw new aaaj(10, String.format("Inelegibile calling package: %s", this.f75748d));
            }
        } else {
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f75746b.mo40721a(status);
    }
}
