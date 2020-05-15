package p000;

import com.google.android.gms.common.Feature;
import com.google.android.gms.nearby.connection.AdvertisingOptions;

/* renamed from: aifc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aifc extends roh {

    /* renamed from: c */
    final /* synthetic */ byte[] f68858c;

    /* renamed from: d */
    final /* synthetic */ String f68859d;

    /* renamed from: e */
    final /* synthetic */ rod f68860e;

    /* renamed from: f */
    final /* synthetic */ AdvertisingOptions f68861f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aifc(rod rod, Feature[] featureArr, byte[] bArr, String str, rod rod2, AdvertisingOptions advertisingOptions) {
        super(rod, featureArr);
        this.f68858c = bArr;
        this.f68859d = str;
        this.f68860e = rod2;
        this.f68861f = advertisingOptions;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo24970a(rjd rjd, aucf aucf) {
        aieh aieh = (aieh) rjd;
        aifj aifj = new aifj(aucf);
        byte[] bArr = this.f68858c;
        String str = this.f68859d;
        rod rod = this.f68860e;
        AdvertisingOptions advertisingOptions = this.f68861f;
        aids aids = new aids(rod);
        aieh.f68831c.add(aids);
        aiik aiik = new aiik();
        aiik.mo37537a(new aieg(aifj));
        aiik.f68916a.f80635h = bArr;
        aiik.mo37540b(str);
        aiik.mo37538a(advertisingOptions);
        aiik.mo37536a(aids);
        ((aigl) aieh.mo25289B()).mo36598a(aiik.f68916a);
    }
}
