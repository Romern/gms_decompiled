package p000;

import android.content.Intent;
import android.util.Base64;
import com.google.android.wallet.bender3.framework.client.WidgetResult;

/* renamed from: awed */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awed extends awei {

    /* renamed from: a */
    private final dnx f94197a;

    /* renamed from: b */
    private final bjhm f94198b;

    public awed(dnx dnx, bjhm bjhm) {
        this.f94197a = dnx;
        this.f94198b = bjhm;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bjhm.a(bwzh, boolean):void
     arg types: [bwzh, int]
     candidates:
      bjhm.a(int, bjfd):void
      bjil.a(long, android.os.Bundle):android.os.Bundle
      bjil.a(long, bjil):void
      bjfg.a(int, bjfd):void
      bjhm.a(bwzh, boolean):void */
    /* renamed from: a */
    public final void mo52008a() {
        byte[] byteArrayExtra = this.f94197a.getIntent().getByteArrayExtra("o2ActionToken");
        if (byteArrayExtra == null) {
            byte[] byteArrayExtra2 = this.f94197a.getIntent().getByteArrayExtra("encryptedParams");
            if (byteArrayExtra2 != null) {
                bjhm bjhm = this.f94198b;
                bxvd da = bwzf.f161591f.mo74144da();
                ByteString a = ByteString.m123261a(byteArrayExtra2);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bwzf bwzf = (bwzf) da.f164949b;
                a.getClass();
                bwzf.f161593a |= 4;
                bwzf.f161596d = a;
                bjhm.mo65234a(da);
                return;
            }
            return;
        }
        bjhm bjhm2 = this.f94198b;
        bwzh bwzh = ((bwmk) bjhq.m103512a(byteArrayExtra, (bxxk) bwmk.f160283b.mo74142c(7))).f160285a;
        if (bwzh == null) {
            bwzh = bwzh.f161606d;
        }
        bjhm2.mo65233a(bwzh, true);
    }

    /* renamed from: a */
    public final void mo52009a(WidgetResult widgetResult) {
        Intent intent = new Intent();
        byte[] bArr = widgetResult.f151770a;
        if (bArr.length > 0) {
            intent.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_INTEGRATOR_CALLBACK_DATA_TOKEN", bArr);
            intent.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_ORDER_ID", Base64.encodeToString(bArr, 2));
        }
        byte[] bArr2 = widgetResult.f151771b;
        if (bArr2.length > 0) {
            intent.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_CLIENT_CALLBACK_DATA_TOKEN", bArr2);
        }
        intent.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_SERVER_ANALYTICS_TOKEN", new byte[0]);
        intent.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_ANALYTICS_PROTO", new byte[0]);
        this.f94197a.setResult(-1, intent);
        this.f94197a.finish();
    }
}
