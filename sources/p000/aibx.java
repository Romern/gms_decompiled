package p000;

import android.content.Context;
import android.content.Intent;

/* renamed from: aibx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aibx implements bqfp {

    /* renamed from: a */
    final /* synthetic */ byte[] f68643a;

    /* renamed from: b */
    final /* synthetic */ aiaa f68644b;

    /* renamed from: c */
    final /* synthetic */ aiby f68645c;

    public aibx(aiby aiby, byte[] bArr, aiaa aiaa) {
        this.f68645c = aiby;
        this.f68643a = bArr;
        this.f68644b = aiaa;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        Void voidR = (Void) obj;
        aiby aiby = this.f68645c;
        ahwb ahwb = aiby.f68650e.f68713j;
        String str = aiby.f68648c;
        byte[] bArr = this.f68643a;
        aiaa aiaa = this.f68644b;
        Context context = ahwb.f68206a;
        ahvb ahvb = new ahvb(context, new ahsu(context, aiaa), true);
        String a = ahvd.m56709a(aiaa);
        if (!cfog.m141291s().equals(a)) {
            Intent a2 = busn.m120389a(ahwb.f68206a, str, bArr);
            if (a2 == null) {
                ((bnsl) ahsd.f67925a.mo68388c()).mo68405a("RetroactivePairManager: Can't create retroactive launch intent");
                return;
            }
            ahsc ahsc = (ahsc) ahgz.m55754a(ahvb.f68143e, ahsc.class);
            String a3 = ahsc.mo37009a("fast_pair_retroactive_device_ready_description", new Object[0]);
            aicx b = ahvb.mo37196b();
            b.mo37421b(a3);
            b.f22269u = "recommendation";
            b.mo13640e(ahsc.mo37009a("fast_pair_retroactive_device_ready_title", new Object[0]));
            b.mo13632b((CharSequence) a3);
            b.mo13620a(ahvb.mo37197b(a2));
            ahvb.mo37192a(b.mo13629b(), ahvb.f68142a);
            return;
        }
        ahvb.mo37193a(a, buqx.m120256a(str), buqx.m120262c(str), str);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ahvb.a(boolean, android.content.Intent):android.app.PendingIntent
     arg types: [int, ?[OBJECT, ARRAY]]
     candidates:
      ahvb.a(java.lang.String, java.lang.String):android.content.Intent
      ahvb.a(android.app.Notification, int):void
      ahvb.a(java.lang.String, android.content.Intent):void
      ahvb.a(boolean, android.content.Intent):android.app.PendingIntent */
    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        ahwb ahwb = this.f68645c.f68650e.f68713j;
        aiaa aiaa = this.f68644b;
        Context context = ahwb.f68206a;
        ahvb ahvb = new ahvb(context, new ahsu(context, aiaa), true);
        ahsc ahsc = (ahsc) ahgz.m55754a(ahvb.f68143e, ahsc.class);
        String a = ahsc.mo37009a("fast_pair_retroactive_could_not_save_description", new Object[0]);
        aicx b = ahvb.mo37196b();
        b.mo37421b(a);
        b.f22269u = "err";
        b.mo13640e(ahsc.mo37009a("fast_pair_retroactive_could_not_save_title", ahvb.f68144f.mo37086k()));
        b.mo13632b((CharSequence) a);
        b.mo13620a(ahvb.mo37188a(false, (Intent) null));
        b.mo13631b(ahvb.mo37188a(false, (Intent) null));
        ahvb.mo37192a(b.mo13629b(), ahvb.f68142a);
    }
}
