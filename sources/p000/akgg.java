package p000;

import com.google.android.gms.nearby.sharing.ShareTarget;

/* renamed from: akgg */
final /* synthetic */ class akgg implements Runnable {

    /* renamed from: a */
    private final akgh f71861a;

    /* renamed from: b */
    private final byte[] f71862b;

    /* renamed from: c */
    private final ShareTarget f71863c;

    /* renamed from: d */
    private final String f71864d;

    /* renamed from: e */
    private final ajud f71865e;

    /* renamed from: f */
    private final akgo f71866f;

    public akgg(akgh akgh, byte[] bArr, ShareTarget shareTarget, String str, ajud ajud, akgo akgo) {
        this.f71861a = akgh;
        this.f71862b = bArr;
        this.f71863c = shareTarget;
        this.f71864d = str;
        this.f71865e = ajud;
        this.f71866f = akgo;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: akgy.a(akce, boolean):com.google.android.gms.nearby.sharing.ShareTarget
     arg types: [akce, int]
     candidates:
      akgy.a(java.lang.String, java.util.concurrent.Callable):int
      akgy.a(akdd, ajnv):ajnw
      akgy.a(ajnm, byte[]):akgr
      akgy.a(android.content.Intent, com.google.android.gms.nearby.sharing.FileAttachment):android.content.Intent
      akgy.a(long, akdd):void
      akgy.a(akdd, ajne):void
      akgy.a(com.google.android.gms.nearby.sharing.ShareTarget, int):void
      akgy.a(java.util.List, long):boolean
      akgy.a(byte, byte[]):byte[]
      akgy.a(com.google.android.gms.nearby.sharing.ShareTarget, ajud):ajud
      akgy.a(java.io.File, com.google.android.gms.nearby.sharing.FileAttachment):android.net.Uri
      akgy.a(java.lang.Runnable, long):java.util.concurrent.ScheduledFuture
      akgy.a(ajsn, akbz):void
      akgy.a(ajud, com.google.android.gms.nearby.sharing.ShareTarget):void
      akgy.a(com.google.android.gms.nearby.sharing.Attachment, long):void
      akgy.a(com.google.android.gms.nearby.sharing.ShareTarget, java.lang.String):void
      akgy.a(java.lang.String, int):void
      akgy.a(java.lang.String, java.lang.Exception):void
      akgy.a(java.lang.String, byte[]):void
      akcd.a(ajsn, akbz):void
      akdr.a(java.lang.String, int):void
      akdr.a(java.lang.String, byte[]):void
      akgy.a(akce, boolean):com.google.android.gms.nearby.sharing.ShareTarget */
    public final void run() {
        ShareTarget a;
        akgh akgh = this.f71861a;
        byte[] bArr = this.f71862b;
        ShareTarget shareTarget = this.f71863c;
        String str = this.f71864d;
        ajud ajud = this.f71865e;
        akgo akgo = this.f71866f;
        akce a2 = akce.m59343a(bArr);
        if (a2 != null && (a = akgh.f71870d.mo39374a(a2, false)) != null && akda.m59444a(shareTarget, a)) {
            srn srn = ajvp.f71371a;
            akgh.f71870d.mo39396b(a, str);
            akgh.f71870d.mo39371a(a, ajud);
            akgy akgy = akgh.f71870d;
            akgq akgq = (akgq) akgy.f71936c.remove(a);
            if (akgq != null) {
                akgq akgq2 = (akgq) akgy.f71936c.remove(shareTarget);
                if (akgq2 != null) {
                    ahiq[] ahiqArr = akgq2.f71902i;
                    if (ahiqArr.length > 0) {
                        akgq.f71902i = ahiqArr;
                    }
                }
                if (akgq2 != null) {
                    ahiq[] ahiqArr2 = akgq2.f71901h;
                    if (ahiqArr2.length > 0) {
                        akgq.f71901h = ahiqArr2;
                    }
                }
                if (akgq2 != null) {
                    ahiq[] ahiqArr3 = akgq2.f71903j;
                    if (ahiqArr3.length > 0) {
                        akgq.f71903j = ahiqArr3;
                    }
                }
                akgy.f71936c.put(shareTarget, akgq);
            }
            akgh.f71870d.f71950q.mo39243a(shareTarget, str, bArr);
            akgo.f71888a.mo69138b(shareTarget);
            akgh.f71870d.mo39419m();
        }
    }
}
