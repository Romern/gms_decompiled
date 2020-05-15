package p000;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: gal */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class gal implements gai {

    /* renamed from: a */
    private final String f17789a;

    protected gal(String str, ClientContext clientContext) {
        sdo.m34959a((Object) str);
        this.f17789a = str;
        sdo.m34959a(clientContext);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract DataHolder mo11597a();

    /* renamed from: a */
    public final void mo11592a(Context context, fzw fzw) {
        DataHolder dataHolder;
        try {
            dataHolder = mo11597a();
        } catch (gid e) {
            Log.e(this.f17789a, "Auth error while performing operation, requesting reconnect", e);
            dataHolder = DataHolder.m22539b(2);
        } catch (gag e2) {
            throw null;
        } catch (RuntimeException e3) {
            Log.e(this.f17789a, "Runtime exception while performing operation", e3);
            Log.wtf(this.f17789a, "Killing (on development devices) due to RuntimeException", e3);
            dataHolder = DataHolder.m22539b(1);
        }
        try {
            mo11598a(dataHolder);
        } catch (RemoteException e4) {
        } catch (Throwable th) {
            dataHolder.close();
            throw th;
        }
        dataHolder.close();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo11598a(DataHolder dataHolder);
}
