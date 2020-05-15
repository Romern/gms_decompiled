package p000;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.ads.afma.proto2api.C0152c;
import com.google.android.gms.gass.internal.GassEventParcel;
import com.google.android.gms.gass.internal.GassRequestParcel;
import com.google.android.gms.gass.internal.GassResponseParcel;
import com.google.android.gms.gass.internal.ProgramRequest;
import com.google.android.gms.gass.internal.ProgramResponse;
import java.util.Arrays;

/* renamed from: aahx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aahx extends dck implements aahy {

    /* renamed from: a */
    private final aagr f28151a;

    /* renamed from: b */
    private final aagi f28152b;

    public aahx() {
        super("com.google.android.gms.gass.internal.IGassService");
    }

    /* renamed from: a */
    private static ProgramResponse m21274a(int i) {
        return new ProgramResponse(null, i);
    }

    /* renamed from: a */
    public final GassResponseParcel mo16883a(GassRequestParcel gassRequestParcel) {
        if (TextUtils.isEmpty(gassRequestParcel.f32755b) || TextUtils.isEmpty(gassRequestParcel.f32756c)) {
            return new GassResponseParcel(C0152c.f7500Q);
        }
        return new GassResponseParcel(aags.m21239a(rpr.m34216b(), gassRequestParcel.f32755b, gassRequestParcel.f32756c));
    }

    public aahx(aagr aagr, aagi aagi) {
        super("com.google.android.gms.gass.internal.IGassService");
        this.f28151a = aagr;
        this.f28152b = aagi;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0126  */
    /* renamed from: a */
    public final ProgramResponse mo16884a(ProgramRequest programRequest) {
        byte[] bArr;
        bxvd da;
        bxvd da2;
        int i;
        if (!cebg.m135923b()) {
            return m21274a(7);
        }
        dcg a = dcg.m8153a(programRequest.f32764e);
        if (a == null) {
            return m21274a(6);
        }
        aahn aahn = new aahn(rpr.m34216b());
        if (a != dcg.UNSUPPORTED) {
            aahn.f28140a.edit().putBoolean(Integer.toString(a.f12804f), true).commit();
        }
        aahk aahk = new aahk(new aaib(rpr.m34216b(), a), this.f28152b);
        long currentTimeMillis = System.currentTimeMillis();
        aaia a2 = aahk.f28137a.mo16890a();
        byte[] bArr2 = null;
        if (a2 == null || a2.mo16889b()) {
            aahk.mo16873a(5004, currentTimeMillis);
            return new ProgramResponse(null, 1);
        }
        dci dci = a2.f28157a;
        String str = programRequest.f32762c;
        if (str == null || !str.equals(dci.f12814b)) {
            if (a2.f28160d == null) {
                a2.f28160d = aaic.m21300a(a2.f28158b);
            }
            byte[] bArr3 = a2.f28160d;
            if (bArr3 != null) {
                bArr = Arrays.copyOf(bArr3, bArr3.length);
                String str2 = programRequest.f32763d;
                if (str2 == null || !str2.equals(dci.f12815c)) {
                    bArr2 = a2.mo16888a();
                }
                da = dci.f12811g.mo74144da();
                String str3 = dci.f12814b;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                dci dci2 = (dci) da.f164949b;
                str3.getClass();
                int i2 = dci2.f12813a | 1;
                dci2.f12813a = i2;
                dci2.f12814b = str3;
                String str4 = dci.f12815c;
                str4.getClass();
                int i3 = i2 | 2;
                dci2.f12813a = i3;
                dci2.f12815c = str4;
                long j = dci.f12816d;
                int i4 = 4;
                dci2.f12813a = i3 | 4;
                dci2.f12816d = j;
                dci dci3 = (dci) da.mo74062i();
                da2 = dch.f12805e.mo74144da();
                if (bArr2 == null) {
                    bxtx a3 = bxtx.m123261a(bArr2);
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    dch dch = (dch) da2.f164949b;
                    a3.getClass();
                    dch.f12807a |= 4;
                    dch.f12810d = a3;
                    i = 3;
                } else {
                    i = 2;
                }
                if (bArr == null) {
                    bxtx a4 = bxtx.m123261a(bArr);
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    dch dch2 = (dch) da2.f164949b;
                    a4.getClass();
                    dch2.f12807a |= 2;
                    dch2.f12809c = a4;
                } else {
                    i4 = i;
                }
                aahk.mo16873a(5003, currentTimeMillis);
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                dch dch3 = (dch) da2.f164949b;
                dci3.getClass();
                dch3.f12808b = dci3;
                dch3.f12807a |= 1;
                return new ProgramResponse(((dch) da2.mo74062i()).mo73639aL().mo73780k(), i4);
            }
        }
        bArr = null;
        String str22 = programRequest.f32763d;
        bArr2 = a2.mo16888a();
        da = dci.f12811g.mo74144da();
        String str32 = dci.f12814b;
        if (da.f164950c) {
        }
        dci dci22 = (dci) da.f164949b;
        str32.getClass();
        int i22 = dci22.f12813a | 1;
        dci22.f12813a = i22;
        dci22.f12814b = str32;
        String str42 = dci.f12815c;
        str42.getClass();
        int i32 = i22 | 2;
        dci22.f12813a = i32;
        dci22.f12815c = str42;
        long j2 = dci.f12816d;
        int i42 = 4;
        dci22.f12813a = i32 | 4;
        dci22.f12816d = j2;
        dci dci32 = (dci) da.mo74062i();
        da2 = dch.f12805e.mo74144da();
        if (bArr2 == null) {
        }
        if (bArr == null) {
        }
        aahk.mo16873a(5003, currentTimeMillis);
        if (da2.f164950c) {
        }
        dch dch32 = (dch) da2.f164949b;
        dci32.getClass();
        dch32.f12808b = dci32;
        dch32.f12807a |= 1;
        return new ProgramResponse(((dch) da2.mo74062i()).mo73639aL().mo73780k(), i42);
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            GassResponseParcel a = mo16883a((GassRequestParcel) dcl.m8163a(parcel, GassRequestParcel.CREATOR));
            parcel2.writeNoException();
            dcl.m8169b(parcel2, a);
        } else if (i == 2) {
            GassEventParcel gassEventParcel = (GassEventParcel) dcl.m8163a(parcel, GassEventParcel.CREATOR);
            if (cebd.m135899c() && this.f28151a != null) {
                try {
                    aahq aahq = (aahq) bxvk.m124014a(aahq.f28146a, gassEventParcel.f32753b);
                    aagr aagr = this.f28151a;
                    bxvd da = aahp.f28142c.mo74144da();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    aahp aahp = (aahp) da.f164949b;
                    aahq.getClass();
                    aahp.f28145b = aahq;
                    aahp.f28144a |= 2;
                    qwo a2 = aagr.f28089a.mo24335a(((aahp) da.mo74062i()).mo73642k());
                    a2.mo24328b(2);
                    a2.mo24327b();
                } catch (bxwf e) {
                }
            }
            parcel2.writeNoException();
        } else if (i != 3) {
            return false;
        } else {
            ProgramResponse a3 = mo16884a((ProgramRequest) dcl.m8163a(parcel, ProgramRequest.CREATOR));
            parcel2.writeNoException();
            dcl.m8169b(parcel2, a3);
        }
        return true;
    }
}
