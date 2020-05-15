package p000;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: azaq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azaq extends aaab {

    /* renamed from: a */
    private final String f98867a;

    /* renamed from: b */
    private final String f98868b;

    /* renamed from: c */
    private final azph f98869c;

    /* renamed from: d */
    private final fzt f98870d;

    public azaq(fzt fzt, String str, String str2, azph azph) {
        super(146, "RetrieveMessage");
        this.f98870d = fzt;
        this.f98867a = str2;
        this.f98868b = str;
        this.f98869c = azph;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        String a = azdl.m85412a(context).mo54738a();
        Object[] objArr = {this.f98867a, a};
        DataHolder dataHolder = null;
        try {
            if (TextUtils.isEmpty(this.f98868b) || TextUtils.isEmpty(this.f98867a) || !TextUtils.equals(this.f98867a, a)) {
                fzt fzt = this.f98870d;
                String str = this.f98868b;
                String str2 = this.f98867a;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 36 + String.valueOf(str2).length());
                sb.append("Invalid packageName=");
                sb.append(str);
                sb.append(" or phoneNumber=");
                sb.append(str2);
                fzt.mo11567a(new Status(8, sb.toString()), (DataHolder) null);
                this.f98869c.mo55147a(424, this.f98868b);
                return;
            }
            azcd a2 = azcd.m85252a(context);
            long currentTimeMillis = System.currentTimeMillis() - cfeo.m138894y();
            Cursor a3 = azcm.m85300a(context).mo54638a(currentTimeMillis);
            Bundle bundle = new Bundle();
            bundle.putString("session_id", String.format("%s:%s", a, Long.valueOf(currentTimeMillis)));
            bundle.putString("install_conversation_id", a2.mo54612d(this.f98868b));
            DataHolder dataHolder2 = new DataHolder(new azas(context, a3, a), bundle);
            try {
                this.f98870d.mo11567a(Status.f30107a, dataHolder2);
                this.f98869c.mo55147a(423, this.f98868b);
                if (!dataHolder2.mo17768b()) {
                    dataHolder2.close();
                }
            } catch (RemoteException e) {
                dataHolder = dataHolder2;
                if (dataHolder != null) {
                }
            } catch (Throwable th) {
                th = th;
                dataHolder = dataHolder2;
                dataHolder.close();
                throw th;
            }
        } catch (RemoteException e2) {
            if (dataHolder != null && !dataHolder.mo17768b()) {
                dataHolder.close();
            }
        } catch (Throwable th2) {
            th = th2;
            if (dataHolder != null && !dataHolder.mo17768b()) {
                dataHolder.close();
            }
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        try {
            this.f98870d.mo11567a(Status.f30109c, (DataHolder) null);
            this.f98869c.mo55147a(424, this.f98868b);
        } catch (RemoteException e) {
        }
    }
}
