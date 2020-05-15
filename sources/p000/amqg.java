package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState;
import java.util.ArrayList;

/* renamed from: amqg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amqg extends aaab {

    /* renamed from: a */
    private final amvj f75739a;

    /* renamed from: b */
    private final alss f75740b;

    /* renamed from: c */
    private final String f75741c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public amqg(alss alss, Context context, String str) {
        super(208, "GetBackupAndSyncOptInState");
        amvj a = amvj.m63368a(context);
        this.f75741c = str;
        this.f75739a = a;
        this.f75740b = alss;
    }

    /* renamed from: a */
    private static void m63167a(bxvd bxvd) {
        almk.m61263a().mo40515a((amkw) bxvd.mo74062i());
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0068, code lost:
        if (r0 == false) goto L_0x006a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ae A[Catch:{ Exception -> 0x0157, all -> 0x0155 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0132 A[Catch:{ Exception -> 0x0157, all -> 0x0155 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x013b A[Catch:{ Exception -> 0x0157, all -> 0x0155 }] */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        BackupAndSyncOptInState backupAndSyncOptInState;
        boolean z;
        int b = amqf.m63166b(this.f75741c);
        bxvd da = amkw.f75120e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        amkw amkw = (amkw) da.f164949b;
        amkw.f75123b = 3;
        int i = amkw.f75122a | 1;
        amkw.f75122a = i;
        int i2 = b - 1;
        int[] iArr = null;
        if (b != 0) {
            amkw.f75125d = i2;
            amkw.f75122a = i | 4;
            boolean b2 = cfxe.m143363b();
            if (amqf.m63165a(this.f75741c)) {
                if (!cfxe.f185877a.mo6606a().mo82880c()) {
                    try {
                        alss alss = this.f75740b;
                        Status status = Status.f30107a;
                        amvj amvj = this.f75739a;
                        if (!cgbt.m144707c()) {
                            if (cfxe.m143367f()) {
                                try {
                                    if (amvj.mo41378a()) {
                                        backupAndSyncOptInState = amvj.m63372d();
                                    }
                                } catch (aaaj e) {
                                    backupAndSyncOptInState = amvj.m63372d();
                                }
                            }
                            amsd c = amvj.mo41381c();
                            Account[] a = amvj.f76016a.mo41374a(cfxe.m143371j(), cfxe.m143372k());
                            ArrayList arrayList = new ArrayList();
                            for (Account account : a) {
                                arrayList.add(account.name);
                            }
                            String[] strArr = (String[]) arrayList.toArray(new String[0]);
                            if (c.f75843b) {
                                String str = c.f75844c;
                                bxvt bxvt = c.f75845d;
                                if (bxvt != null) {
                                    int size = bxvt.size();
                                    int[] iArr2 = new int[size];
                                    for (int i3 = 0; i3 < size; i3++) {
                                        iArr2[i3] = ((Integer) bxvt.get(i3)).intValue();
                                    }
                                    iArr = iArr2;
                                }
                                backupAndSyncOptInState = new BackupAndSyncOptInState(str, iArr, 3, strArr);
                            } else if (strArr.length > 0) {
                                backupAndSyncOptInState = new BackupAndSyncOptInState(null, new int[0], 2, strArr);
                            } else {
                                backupAndSyncOptInState = amvj.m63372d();
                            }
                        } else {
                            backupAndSyncOptInState = amvj.m63372d();
                        }
                        alss.mo40722a(status, backupAndSyncOptInState);
                        if (b2) {
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            amkw amkw2 = (amkw) da.f164949b;
                            amkw2.f75124c = 1;
                            amkw2.f75122a |= 2;
                            m63167a(da);
                        }
                    } catch (Exception e2) {
                        if (b2) {
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            amkw amkw3 = (amkw) da.f164949b;
                            amkw3.f75124c = 0;
                            amkw3.f75122a |= 2;
                            m63167a(da);
                        }
                        throw e2;
                    } catch (Throwable th) {
                        da.mo74062i();
                        throw th;
                    }
                } else {
                    if (b != 2) {
                        if (cfxe.m143364c()) {
                            if (!cfxe.f185877a.mo6606a().mo82890m()) {
                                z = cfus.m143110h();
                            } else {
                                z = cfus.m143109g();
                            }
                        }
                        this.f75740b.mo40722a(Status.f30107a, new BackupAndSyncOptInState(null, new int[0], 4, new String[0]));
                        if (b2) {
                            almk a2 = almk.m61263a();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            amkw amkw4 = (amkw) da.f164949b;
                            amkw4.f75124c = 1;
                            amkw4.f75122a |= 2;
                            a2.mo40515a((amkw) da.mo74062i());
                        }
                    }
                    alss alss2 = this.f75740b;
                    Status status2 = Status.f30107a;
                    amvj amvj2 = this.f75739a;
                    if (!cgbt.m144707c()) {
                    }
                    alss2.mo40722a(status2, backupAndSyncOptInState);
                    if (b2) {
                    }
                }
                da.mo74062i();
                return;
            }
            if (b2) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                amkw amkw5 = (amkw) da.f164949b;
                amkw5.f75124c = 0;
                amkw5.f75122a |= 2;
                m63167a(da);
            }
            throw new aaaj(10, String.format("Inelegibile calling package: %s", this.f75741c));
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f75740b.mo40722a(status, (BackupAndSyncOptInState) null);
    }
}
