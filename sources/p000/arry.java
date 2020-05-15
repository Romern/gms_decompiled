package p000;

import android.accounts.Account;
import android.net.Uri;
import android.util.Base64;
import com.android.volley.toolbox.RequestFuture;
import com.google.android.gms.smartdevice.setup.accounts.Assertion;
import com.google.android.gms.smartdevice.setup.accounts.Challenge;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* renamed from: arry */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arry implements Callable {

    /* renamed from: a */
    final /* synthetic */ String f88207a;

    /* renamed from: b */
    final /* synthetic */ Account f88208b;

    /* renamed from: c */
    final /* synthetic */ boolean f88209c;

    /* renamed from: d */
    final /* synthetic */ arsb f88210d;

    public arry(arsb arsb, String str, Account account, boolean z) {
        this.f88210d = arsb;
        this.f88207a = str;
        this.f88208b = account;
        this.f88209c = z;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aruc.a(com.google.android.gms.smartdevice.setup.accounts.Challenge, boolean, boolean):com.google.android.gms.smartdevice.setup.accounts.Assertion
     arg types: [com.google.android.gms.smartdevice.setup.accounts.Challenge, boolean, int]
     candidates:
      aruc.a(arwd, com.google.android.gms.smartdevice.setup.accounts.Challenge[], boolean):void
      arwf.a(int, android.os.Parcel, android.os.Parcel):boolean
      dck.a(int, android.os.Parcel, android.os.Parcel):boolean
      arwg.a(arwd, com.google.android.gms.smartdevice.setup.accounts.Challenge[], boolean):void
      aruc.a(com.google.android.gms.smartdevice.setup.accounts.Challenge, boolean, boolean):com.google.android.gms.smartdevice.setup.accounts.Assertion */
    public final /* bridge */ /* synthetic */ Object call() {
        byte[] decode = Base64.decode(this.f88207a, 11);
        Challenge challenge = new Challenge();
        challenge.mo59151e(this.f88208b.name);
        challenge.mo59148a(0);
        challenge.mo59149c(decode);
        challenge.mo59150d(new byte[0]);
        Assertion a = this.f88210d.f88216e.mo48823a(challenge, this.f88209c, true);
        arsb arsb = this.f88210d;
        brzo a2 = arsb.f88216e.mo48822a(a);
        Account account = this.f88208b;
        String uri = new Uri.Builder().scheme("https").encodedAuthority(cgqi.f187508a.mo6606a().mo84278b()).appendPath("v1").appendPath("challenges").appendPath(Base64.encodeToString(a2.f143774f.mo73780k(), 11)).appendEncodedPath("assertion:record").build().toString();
        arsb.f88212a.mo25412b(uri.toString(), new Object[0]);
        bxvd da = byql.f167388c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byql byql = (byql) da.f164949b;
        a2.getClass();
        byql.f167391b = a2;
        byql.f167390a |= 2;
        String a3 = gie.m13187a(arsb.f88218g, account, "oauth2:https://www.googleapis.com/auth/cryptauth");
        RequestFuture newFuture = RequestFuture.newFuture();
        arsb.f88214c.add(new sia(1, uri, ((byql) da.mo74062i()).mo73642k(), byql.f167388c, newFuture, newFuture, a3, null, false, new HashMap(), 21249, -1));
        newFuture.get();
        return a;
    }
}
