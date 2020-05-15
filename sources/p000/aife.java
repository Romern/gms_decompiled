package p000;

import com.google.android.gms.nearby.connection.AdvertisingOptions;

/* renamed from: aife */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aife extends roh {

    /* renamed from: c */
    final /* synthetic */ String f68862c;

    /* renamed from: d */
    final /* synthetic */ String f68863d;

    /* renamed from: e */
    final /* synthetic */ rod f68864e;

    /* renamed from: f */
    final /* synthetic */ AdvertisingOptions f68865f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aife(rod rod, String str, String str2, rod rod2, AdvertisingOptions advertisingOptions) {
        super(rod);
        this.f68862c = str;
        this.f68863d = str2;
        this.f68864e = rod2;
        this.f68865f = advertisingOptions;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo24970a(rjd rjd, aucf aucf) {
        aieh aieh = (aieh) rjd;
        aifj aifj = new aifj(aucf);
        String str = this.f68862c;
        String str2 = this.f68863d;
        rod rod = this.f68864e;
        AdvertisingOptions advertisingOptions = this.f68865f;
        aids aids = new aids(rod);
        aieh.f68831c.add(aids);
        aiik aiik = new aiik();
        aiik.mo37537a(new aieg(aifj));
        aiik.mo37539a(str);
        aiik.mo37540b(str2);
        aiik.mo37538a(advertisingOptions);
        aiik.mo37536a(aids);
        ((aigl) aieh.mo25289B()).mo36598a(aiik.f68916a);
    }
}
