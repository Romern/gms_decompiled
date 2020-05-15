package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.people.contactssync.model.BackupAndSyncSuggestion;

/* renamed from: amqh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amqh extends aaab {

    /* renamed from: a */
    private final amvl f75742a;

    /* renamed from: b */
    private final alss f75743b;

    /* renamed from: c */
    private final String f75744c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public amqh(alss alss, Context context, String str) {
        super(208, "GetBackupAndSyncSuggestion");
        amvl amvl = new amvl(context);
        this.f75744c = str;
        this.f75742a = amvl;
        this.f75743b = alss;
    }

    /* renamed from: a */
    private static final void m63170a(bxvd bxvd) {
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
        amkw.f75123b = 4;
        amkw.f75122a |= 1;
        int b = amqf.m63166b(this.f75744c);
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
            if (amqf.m63165a(this.f75744c)) {
                try {
                    alss alss = this.f75743b;
                    Status status = Status.f30107a;
                    amvl amvl = this.f75742a;
                    int b3 = amvl.mo41388b();
                    if (!amvl.m63384c() || !amvl.m63385d()) {
                        int a = amvl.mo41385a();
                        if (!amvl.m63385d()) {
                            if (amvl.m63383a(b3, a)) {
                            }
                            b3 = 0;
                        }
                        if (!amvl.m63384c()) {
                            if (b3 > a) {
                                b3 -= a;
                            }
                            b3 = 0;
                        }
                    }
                    alss.mo40723a(status, new BackupAndSyncSuggestion(b3));
                    if (b2) {
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        amkw amkw3 = (amkw) da.f164949b;
                        amkw3.f75124c = 1;
                        amkw3.f75122a |= 2;
                        m63170a(da);
                    }
                    da.mo74062i();
                } catch (Exception e) {
                    if (b2) {
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        amkw amkw4 = (amkw) da.f164949b;
                        amkw4.f75124c = 0;
                        amkw4.f75122a |= 2;
                        m63170a(da);
                    }
                    if (!cfxb.f185869a.mo6606a().mo82852a() || !(e instanceof SecurityException)) {
                        throw e;
                    }
                    String valueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
                    sb.append("Error when reading contact count.");
                    sb.append(valueOf);
                    throw new aaaj(8, sb.toString());
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
                    m63170a(da);
                }
                throw new aaaj(10, String.format("Inelegibile calling package: %s", this.f75744c));
            }
        } else {
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f75743b.mo40723a(status, (BackupAndSyncSuggestion) null);
    }
}
