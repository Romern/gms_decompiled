package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.google.android.gms.people.internal.ParcelableLoadImageOptions;
import com.google.android.gms.people.model.AvatarReference;

/* renamed from: alpa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alpa extends aloo {

    /* renamed from: s */
    private static final bngx f73995s = bngx.m109359a(1, 9, 6, 7);

    /* renamed from: t */
    private final ConnectivityManager f73996t;

    /* renamed from: u */
    private final alok f73997u;

    public alpa(String str, int i, ConnectivityManager connectivityManager, alok alok, almp almp, AvatarReference avatarReference, ParcelableLoadImageOptions parcelableLoadImageOptions) {
        super(str, i, almp, avatarReference, parcelableLoadImageOptions, "LoadAvatarByReferenceCp2FocusOrUrl");
        this.f73996t = connectivityManager;
        this.f73997u = alok;
        amig.m62939a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo40608a() {
        String valueOf = String.valueOf(this.f73967a);
        String valueOf2 = String.valueOf(((aloo) this).f73968b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19 + String.valueOf(valueOf2).length());
        sb.append("[avref: ref=");
        sb.append(valueOf);
        sb.append(" opts=");
        sb.append(valueOf2);
        sb.append("]");
        sb.toString();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x016b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x016c A[RETURN] */
    /* renamed from: d */
    public final byte[] mo40621d(Context context) {
        String str;
        String str2;
        byte[] bArr;
        String str3;
        String str4;
        byte[] bArr2;
        AvatarReference avatarReference;
        String str5;
        byte[] bArr3;
        alok alok;
        NetworkInfo activeNetworkInfo;
        AvatarReference avatarReference2;
        AvatarReference avatarReference3;
        amig.m62939a();
        if (((Boolean) amgj.f74886a.mo41191a()).booleanValue()) {
            if (this.f73967a.mo46360a()) {
                avatarReference3 = ameu.m62831c(this.f73967a);
            } else {
                avatarReference3 = this.f73967a;
            }
            str = avatarReference3.f81943e;
            str2 = avatarReference3.f81944f;
        } else {
            str = ameu.m62828a(this.f73967a);
            str2 = ameu.m62830b(this.f73967a);
        }
        int i = 1;
        if (!TextUtils.isEmpty(str2)) {
            long a = altf.m61750a(context, str, str2);
            if (a >= 0) {
                bArr = altf.m61752a(context, a, !((aloo) this).f73968b.f81930c);
                if (bArr == null) {
                    return bArr;
                }
                amig.m62939a();
                if (((Boolean) amgj.f74886a.mo41191a()).booleanValue()) {
                    if (this.f73967a.mo46360a()) {
                        avatarReference2 = ameu.m62831c(this.f73967a);
                    } else {
                        avatarReference2 = this.f73967a;
                    }
                    str3 = avatarReference2.f81943e;
                    str4 = avatarReference2.f81944f;
                } else {
                    str3 = ameu.m62828a(this.f73967a);
                    str4 = ameu.m62830b(this.f73967a);
                }
                if (!TextUtils.isEmpty(str4)) {
                    long b = altf.m61753b(context, str3, str4);
                    if (b >= 0) {
                        bArr2 = altf.m61754b(context, b, !((aloo) this).f73968b.f81930c);
                        if (bArr2 == null) {
                            return bArr2;
                        }
                        amig.m62939a();
                        boolean booleanValue = ((Boolean) amgj.f74886a.mo41191a()).booleanValue();
                        if (booleanValue && this.f73967a.mo46360a()) {
                            avatarReference = ameu.m62831c(this.f73967a);
                        } else {
                            avatarReference = this.f73967a;
                        }
                        if (!booleanValue) {
                            sdo.m34959a(avatarReference);
                            str5 = ameu.m62833d(avatarReference.f81939a, avatarReference.f81940b);
                        } else {
                            str5 = avatarReference.f81941c;
                        }
                        String b2 = ancc.m63973b(str5);
                        int i2 = ((aloo) this).f73968b.f81928a;
                        if (i2 <= 1 || i2 == 4 || Boolean.valueOf(cgbe.f186279a.mo6606a().mo83306aj()).booleanValue()) {
                            i = i2;
                        }
                        String a2 = ancc.m63968a(context, b2, i, ((aloo) this).f73968b.f81929b);
                        if (!TextUtils.isEmpty(a2)) {
                            alok alok2 = this.f73997u;
                            if (alok2 == null || (bArr3 = alok2.mo40618a(a2)) == null) {
                                if (Boolean.valueOf(cgbe.f186279a.mo6606a().mo83435df()).booleanValue() || ((activeNetworkInfo = this.f73996t.getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected() && f73995s.contains(Integer.valueOf(activeNetworkInfo.getType())))) {
                                    bArr3 = almy.m61373a(context).mo40601a(a2, false);
                                    if (!(bArr3 == null || (alok = this.f73997u) == null)) {
                                        alok.mo40617a(a2, bArr3, ((Long) amhh.f74910a.mo41191a()).longValue());
                                    }
                                } else {
                                    bArr3 = null;
                                }
                            }
                        } else {
                            bArr3 = null;
                        }
                        if (bArr3 == null) {
                            return null;
                        }
                        return bArr3;
                    }
                }
                bArr2 = null;
                if (bArr2 == null) {
                }
            }
        }
        bArr = null;
        if (bArr == null) {
        }
    }
}
