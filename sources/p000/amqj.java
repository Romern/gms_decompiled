package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;

/* renamed from: amqj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amqj extends aaab {

    /* renamed from: a */
    private final amvj f75749a;

    /* renamed from: b */
    private final alss f75750b;

    /* renamed from: c */
    private final String f75751c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public amqj(alss alss, Context context, String str) {
        super(208, "OptOutBackupAndSync");
        amvj a = amvj.m63368a(context);
        this.f75749a = a;
        this.f75750b = alss;
        this.f75751c = str;
    }

    /* renamed from: a */
    private static void m63176a(bxvd bxvd) {
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
        amkw.f75123b = 2;
        amkw.f75122a |= 1;
        int b = amqf.m63166b(this.f75751c);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        amkw amkw2 = (amkw) da.f164949b;
        int i = b - 1;
        if (b != 0) {
            amkw2.f75125d = i;
            amkw2.f75122a |= 4;
            boolean b2 = cfxe.m143363b();
            if (amqf.m63165a(this.f75751c)) {
                try {
                    this.f75749a.mo41379b();
                    if (b2) {
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        amkw amkw3 = (amkw) da.f164949b;
                        amkw3.f75124c = 1;
                        amkw3.f75122a |= 2;
                        m63176a(da);
                    }
                    da.mo74062i();
                    this.f75750b.mo40727d(Status.f30107a);
                } catch (Exception e) {
                    if (b2) {
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        amkw amkw4 = (amkw) da.f164949b;
                        amkw4.f75124c = 0;
                        amkw4.f75122a |= 2;
                        m63176a(da);
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
                    amkw5.f75122a = 2 | amkw5.f75122a;
                    m63176a(da);
                }
                throw new aaaj(10, String.format("Inelegibile calling package: %s", this.f75751c));
            }
        } else {
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f75750b.mo40727d(status);
    }
}
