package p000;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.chimera.container.ModuleDependencyDownloadIntentOperation;
import com.google.android.gms.chimera.container.zapp.SynchronizedUpdateBoundService;
import java.util.concurrent.TimeUnit;

/* renamed from: enf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class enf extends dck implements IInterface {

    /* renamed from: a */
    protected final Context f15321a;

    /* renamed from: b */
    private final bnic f15322b;

    public enf() {
        super("com.google.android.finsky.zapp.protocol.ISynchronizedUpdateService");
    }

    /* renamed from: a */
    private static Bundle m10762a(String str, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt(str, i);
        return bundle;
    }

    /* renamed from: a */
    private final void m10763a() {
        String[] packagesForUid = this.f15321a.getPackageManager().getPackagesForUid(Binder.getCallingUid());
        if (packagesForUid != null) {
            int length = packagesForUid.length;
            int i = 0;
            while (i < length) {
                if (!"com.android.vending".equals(packagesForUid[i])) {
                    i++;
                } else {
                    return;
                }
            }
        }
        throw new SecurityException("Not Finsky");
    }

    public enf(Context context) {
        super("com.google.android.finsky.zapp.protocol.ISynchronizedUpdateService");
        this.f15321a = context;
        this.f15322b = bnic.m109488a(bmyx.m108640a(',').mo66920b().mo66917a().mo66918a((CharSequence) cdjh.f180979a.mo6606a().mo77732L()));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: enf.a(byte[], boolean):byte[]
     arg types: [byte[], int]
     candidates:
      enf.a(java.lang.String, int):android.os.Bundle
      enf.a(byte[], boolean):byte[] */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: qnm.a(bojy, boolean):boolean
     arg types: [bojy, int]
     candidates:
      qnm.a(long, long):boolean
      qnm.a(bojy, int):boolean
      qnm.a(qmk, int):boolean
      qnm.a(qmk, qmk):boolean
      qnm.a(qmk, qox):boolean
      qnm.a(bojy, boolean):boolean */
    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        int i2;
        boolean z;
        int i3;
        qml qml;
        Bundle bundle;
        Bundle bundle2;
        int i4 = 2;
        if (i != 1) {
            boolean z2 = false;
            if (i == 2) {
                Bundle bundle3 = (Bundle) dcl.m8163a(parcel, Bundle.CREATOR);
                m10763a();
                int i5 = bundle3.getInt("version_code", 0);
                long j = bundle3.getLong("required_disk_space", -1);
                if (i5 <= 0 || j < 0) {
                    i4 = 0;
                } else {
                    StringBuilder sb = new StringBuilder(48);
                    sb.append("onNotifyPendingUpdate: versionCode = ");
                    sb.append(i5);
                    sb.toString();
                    qlp.m32393a().mo8861a(this.f15321a, 61, String.valueOf(i5));
                    if (!cdot.m134467b()) {
                        qlp.m32393a().mo8860a(this.f15321a, 62);
                        i4 = 1;
                    } else if (i5 <= 201515033) {
                        StringBuilder sb2 = new StringBuilder(55);
                        sb2.append("next container version too low: ");
                        sb2.append(i5);
                        sb2.append(":201515033");
                        sb2.toString();
                        qlp.m32393a().mo8860a(this.f15321a, 66);
                        i4 = 0;
                    } else {
                        qom a = qom.m32578a(this.f15321a);
                        qok a2 = a.mo24171a();
                        if (a2 != null) {
                            i2 = a2.f41868b;
                        } else {
                            i2 = 0;
                        }
                        if (i2 != i5) {
                            try {
                                qnt.m32527a(this.f15321a, i5);
                                byte[] bArr = (byte[]) qnt.f41798a.mo58455c();
                                if (bArr.length != 0) {
                                    qml = (qml) bxvk.m124016a(qml.f41710b, bArr, bxus.m123743b());
                                } else {
                                    qml = qml.f41710b;
                                }
                                bxvd da = qok.f41865e.mo74144da();
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                qok qok = (qok) da.f164949b;
                                int i6 = qok.f41867a | 1;
                                qok.f41867a = i6;
                                qok.f41868b = i5;
                                qok.f41867a = 4 | i6;
                                qok.f41870d = false;
                                if (qml.f41712a.size() == 1) {
                                    qox qox = new qox();
                                    qmk qmk = (qmk) qml.f41712a.get(0);
                                    if (qnm.m32509a(qmk, qox)) {
                                        bojy bojy = (bojy) qmk.f41707a.get(0);
                                        if (qnm.m32504a(bojy, false) && bojy.f133373e != 0) {
                                            if (da.f164950c) {
                                                da.mo74035c();
                                                da.f164950c = false;
                                            }
                                            qok qok2 = (qok) da.f164949b;
                                            qmk.getClass();
                                            qok2.f41869c = qmk;
                                            qok2.f41867a |= 2;
                                        }
                                    }
                                    qox.mo24179a(a.f41874a);
                                }
                                if ((((qok) da.f164949b).f41867a & 2) == 0) {
                                    StringBuilder sb3 = new StringBuilder(39);
                                    sb3.append("Invalid module set list for ");
                                    sb3.append(i5);
                                    Log.w("SyncUpdateMgr", sb3.toString());
                                }
                                if (!a.mo24172a((qok) da.mo74062i())) {
                                    qlp.m32393a().mo8860a(this.f15321a, 69);
                                    i4 = 1;
                                }
                            } catch (bxwf e) {
                                throw new qns(6, e);
                            } catch (qns e2) {
                                String valueOf = String.valueOf(e2);
                                StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf).length() + 44);
                                sb4.append("Failed to get phenotype for next container: ");
                                sb4.append(valueOf);
                                Log.w("SyncUpdateSvc", sb4.toString());
                                qlp.m32393a().mo8861a(this.f15321a, 67, e2.getMessage());
                                i4 = 1;
                            }
                        }
                        synchronized (a.f41875b) {
                            qok a3 = a.mo24171a();
                            if (a3 != null) {
                                if ((a3.f41867a & 2) != 0) {
                                    if (a.f41876c == null) {
                                        z2 = true;
                                    }
                                    bmzs.m108698a(z2);
                                    qol qol = new qol();
                                    a.f41876c = qol;
                                    try {
                                        qln.m32379a(a.f41874a).mo24085a(6, null, null, bngx.m109376e());
                                        qol.f41871a.await(cdji.m133564e(), TimeUnit.SECONDS);
                                    } catch (InterruptedException e3) {
                                        String valueOf2 = String.valueOf(e3);
                                        StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf2).length() + 54);
                                        sb5.append("Interruped while waiting for next container download: ");
                                        sb5.append(valueOf2);
                                        Log.e("SyncUpdateMgr", sb5.toString());
                                        Thread.currentThread().interrupt();
                                    } catch (Throwable th) {
                                        synchronized (a.f41875b) {
                                            a.f41876c = null;
                                            throw th;
                                        }
                                    }
                                    synchronized (a.f41875b) {
                                        a.f41876c = null;
                                    }
                                    z = qol.f41872b;
                                }
                            }
                            qlp.m32393a().mo8860a(a.f41874a, 68);
                            z = true;
                        }
                        qlp a4 = qlp.m32393a();
                        Context context = this.f15321a;
                        if (!z) {
                            i3 = 70;
                        } else {
                            i3 = 63;
                        }
                        a4.mo8860a(context, i3);
                        if (z || cdot.f181447a.mo6606a().mo78083b()) {
                            i4 = 1;
                        }
                    }
                }
                Bundle bundle4 = new Bundle();
                bundle4.putInt("status_code", i4);
                parcel2.writeNoException();
                dcl.m8169b(parcel2, bundle4);
            } else if (i == 3) {
                m10763a();
                byte[] byteArray = ((Bundle) dcl.m8163a(parcel, Bundle.CREATOR)).getByteArray("module_dep_req_bytes");
                if (byteArray == null) {
                    bundle = m10762a("status_code", 2);
                } else {
                    byte[] a5 = mo10315a(byteArray, true);
                    if (a5 == null) {
                        bundle = m10762a("status_code", 0);
                    } else {
                        Bundle a6 = m10762a("status_code", 1);
                        a6.putByteArray("module_dep_resp_bytes", a5);
                        bundle = a6;
                    }
                }
                parcel2.writeNoException();
                dcl.m8169b(parcel2, bundle);
            } else if (i != 4) {
                return false;
            } else {
                m10763a();
                byte[] byteArray2 = ((Bundle) dcl.m8163a(parcel, Bundle.CREATOR)).getByteArray("module_dep_req_bytes");
                if (byteArray2 == null) {
                    bundle2 = m10762a("status_code", 2);
                } else {
                    byte[] a7 = mo10315a(byteArray2, false);
                    if (a7 == null) {
                        bundle2 = m10762a("status_code", 0);
                    } else {
                        Bundle a8 = m10762a("status_code", 1);
                        a8.putByteArray("module_dep_resp_bytes", a7);
                        bundle2 = a8;
                    }
                }
                parcel2.writeNoException();
                dcl.m8169b(parcel2, bundle2);
            }
        } else {
            parcel2.writeNoException();
            parcel2.writeInt(2);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final byte[] mo10315a(byte[] bArr, boolean z) {
        if (!cdjh.m133555e()) {
            return null;
        }
        try {
            aylu aylu = (aylu) bxvk.m124016a(aylu.f97932c, bArr, bxus.m123743b());
            if (aylu.f97934a.isEmpty() || (!this.f15322b.contains(aylu.f97934a) && !this.f15322b.contains("*"))) {
                return SynchronizedUpdateBoundService.m22416a(7);
            }
            ModuleManager.FeatureCheck featureCheck = new ModuleManager.FeatureCheck();
            bxwc bxwc = aylu.f97935b;
            int size = bxwc.size();
            for (int i = 0; i < size; i++) {
                ayls ayls = (ayls) bxwc.get(i);
                int a = aylz.m84242a(ayls.f97929c);
                if (a != 0 && a == 2) {
                    featureCheck.checkFeatureAtVersion(ayls.f97927a, ayls.f97928b);
                }
            }
            int checkFeaturesAreAvailable = ModuleManager.get(this.f15321a).checkFeaturesAreAvailable(featureCheck);
            if (checkFeaturesAreAvailable == 0) {
                return SynchronizedUpdateBoundService.m22416a(3);
            }
            if (checkFeaturesAreAvailable == 1) {
                return SynchronizedUpdateBoundService.m22416a(5);
            }
            if (checkFeaturesAreAvailable != 2) {
                if (checkFeaturesAreAvailable != 3) {
                    return null;
                }
                return SynchronizedUpdateBoundService.m22416a(2);
            } else if (z) {
                bxvd da = aylv.f97937c.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                aylv aylv = (aylv) da.f164949b;
                aylv.f97940b = 3;
                aylv.f97939a |= 1;
                return ((aylv) da.mo74062i()).mo73642k();
            } else {
                Context context = this.f15321a;
                context.startService(ModuleDependencyDownloadIntentOperation.m22406a(context, bArr));
                return SynchronizedUpdateBoundService.m22416a(6);
            }
        } catch (bxwf e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
            sb.append("Unable to parse input proto: ");
            sb.append(valueOf);
            Log.e("SyncUpdateSvc", sb.toString());
            return null;
        }
    }
}
