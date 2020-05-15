package p000;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.tokenization.TokenizePanChimeraService;

/* renamed from: atvb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class atvb extends AsyncTask {

    /* renamed from: d */
    protected final TokenizePanChimeraService f90985d;

    /* renamed from: e */
    protected Messenger f90986e;

    /* renamed from: f */
    protected btnf f90987f;

    /* renamed from: g */
    protected int f90988g;

    static {
        sgj sgj = sgj.UNKNOWN;
    }

    public atvb(TokenizePanChimeraService tokenizePanChimeraService) {
        this.f90985d = tokenizePanChimeraService;
    }

    /* renamed from: a */
    static Message m76438a(int i, Bundle bundle, AccountInfo accountInfo, String str, Handler handler) {
        Message obtain = Message.obtain((Handler) null, i);
        bundle.putParcelable("data_account_info", accountInfo);
        bundle.putString("calling_package", str);
        obtain.setData(bundle);
        if (handler != null) {
            obtain.replyTo = new Messenger(handler);
        }
        return obtain;
    }

    /* renamed from: a */
    public abstract void mo50195a(Object obj);

    /* access modifiers changed from: protected */
    public final void onPostExecute(Object obj) {
        try {
            mo50195a(obj);
        } finally {
            this.f90985d.mo59486a();
        }
    }

    /* access modifiers changed from: protected */
    public final void onPreExecute() {
        this.f90985d.startService(new Intent().setClassName(this.f90985d.getApplicationContext(), "com.google.android.gms.tapandpay.tokenization.TokenizePanService"));
        this.f90985d.f108924b++;
    }

    /* renamed from: a */
    public static btmu m76439a(btnf btnf) {
        return (btmu) atff.m75762a(btnf, btmu.f149546d, 1);
    }

    /* renamed from: a */
    public final void mo50221a(askf askf, int i, int i2) {
        askf.f89126d.getString(i);
        askf.f89126d.getString(i2);
        this.f90988g = 101;
        this.f90987f = atey.m75751a(askf, i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo50222a(bxxc bxxc, int i, int i2) {
        Message message;
        Bundle bundle = new Bundle();
        bundle.putInt("data_request_type", i);
        byte[] bArr = null;
        if (bxxc == null) {
            try {
                message = Message.obtain((Handler) null, this.f90988g);
                btnf btnf = this.f90987f;
                if (btnf != null) {
                    bArr = btnf.mo73642k();
                }
                bundle.putByteArray("tap_and_pay_api_error", bArr);
            } catch (RemoteException e) {
                return;
            }
        } else {
            Message obtain = Message.obtain((Handler) null, i2);
            bundle.putByteArray("data_response", bxxc.mo73642k());
            message = obtain;
        }
        message.setData(bundle);
        this.f90986e.send(message);
    }
}
