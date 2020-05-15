package p000;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: aicl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aicl extends buqn {

    /* renamed from: a */
    final /* synthetic */ String f68686a;

    /* renamed from: b */
    final /* synthetic */ byte[] f68687b;

    /* renamed from: c */
    final /* synthetic */ boolean f68688c;

    /* renamed from: d */
    final /* synthetic */ byte[] f68689d;

    /* renamed from: e */
    final /* synthetic */ int f68690e;

    /* renamed from: f */
    final /* synthetic */ String f68691f;

    /* renamed from: g */
    final /* synthetic */ aics f68692g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aicl(aics aics, String str, String str2, byte[] bArr, boolean z, byte[] bArr2, int i, String str3) {
        super(str);
        this.f68692g = aics;
        this.f68686a = str2;
        this.f68687b = bArr;
        this.f68688c = z;
        this.f68689d = bArr2;
        this.f68690e = i;
        this.f68691f = str3;
    }

    public final void run() {
        ahvb ahvb;
        ahvo ahvo;
        String str = this.f68686a;
        ahsu ahsu = null;
        if (str != null) {
            ahsu = this.f68692g.f68705b.mo37052e(str);
        } else {
            byte[] bArr = this.f68687b;
            if (bArr != null) {
                try {
                    ahsu = new ahsu(this.f68692g.f68708e, (aiaa) bxvk.m124016a(aiaa.f68501K, bArr, bxus.m123744c()));
                } catch (bxwf e) {
                    bnsl bnsl = (bnsl) ahsd.f67925a.mo68388c();
                    bnsl.mo68437a(e);
                    bnsl.mo68409a("Error parsing serialized discovery item with size %d", this.f68687b.length);
                }
            }
        }
        if (ahsu == null || TextUtils.isEmpty(ahsu.mo37088m())) {
            ((bnsl) ahsd.f67925a.mo68388c()).mo68405a("Invalid DiscoveryItem, ignore pairing");
        } else if (ahsu.mo37063J() != 2 && (!cfoj.m141575y() || !this.f68688c)) {
            ((bnsl) ahsd.f67925a.mo68388c()).mo68405a("Incorrect state, ignore pairing");
        } else {
            boolean z = true;
            if (this.f68689d == null && ahsu.mo37089n() == null) {
                z = false;
            }
            int i = this.f68690e;
            if (i == -1) {
                ahvb = new ahvb(this.f68692g.f68708e, ahsu, z);
            } else {
                ahvb = new ahvb(this.f68692g.f68708e, ahsu, z, i);
            }
            ahyh ahyh = new ahyh(this.f68692g.f68708e);
            aics aics = this.f68692g;
            Context context = aics.f68708e;
            String str2 = this.f68691f;
            byte[] bArr2 = this.f68689d;
            buru buru = aics.f68710g;
            boolean z2 = this.f68688c;
            if (!cfoj.m141525F()) {
                if (ahsu.mo37091p() != null && ahsu.mo37091p().f169051e && cfoj.m141524E() && (ahsu.mo37095t() == null || !cfog.m141291s().equals(ahvd.m56710a(ahsu.mo37095t())))) {
                    ahvo = new ahtn(context, ahsu, buru, ahvb, z2);
                } else if (!z2) {
                    ahvo = new ahvn(context, ahsu, str2, bArr2, ahvb);
                } else {
                    ahvo = new ahwc(context, ahsu, buru, ahvb);
                }
            } else if (!z2) {
                ahvo = new ahvj(context, ahsu, bArr2);
            } else {
                ahvo = new ahvr(context, ahsu, buru, ahyh);
            }
            ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("PairingProgressHandler:Create %s for pairing", ahvo.getClass().getSimpleName());
            this.f68692g.mo37399a(ahsu, this.f68689d, this.f68691f, ahvo);
        }
    }
}
