package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.libraries.messaging.lighter.model.ConversationId;

/* renamed from: azey */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azey extends dck implements azez {

    /* renamed from: a */
    azqn f99212a;

    /* renamed from: b */
    private final Context f99213b;

    /* renamed from: c */
    private final azed f99214c;

    public azey() {
        super("com.google.android.libraries.matchstick.net.ILighterWebService");
    }

    /* renamed from: a */
    public final void mo54855a() {
        azqn azqn = this.f99212a;
        if (azqn != null) {
            for (azql azql : azqn.f99904c.values()) {
                azql.mo55226b();
            }
            azqn.f99904c.clear();
            azqn.f99902a = null;
        }
        this.f99212a = null;
    }

    public azey(Context context, azed azed) {
        super("com.google.android.libraries.matchstick.net.ILighterWebService");
        this.f99213b = context.getApplicationContext();
        this.f99214c = azed;
    }

    /* renamed from: a */
    public final void mo54856a(azew azew) {
        Context context = this.f99213b;
        this.f99212a = new azqn(context, new azrl(context, azew, this.f99214c));
    }

    /* renamed from: a */
    public final void mo54857a(String str, String str2) {
        azph.m85998a(this.f99213b).mo55165b(1936);
        azqn azqn = this.f99212a;
        if (azqn == null) {
            azoj.m85933c("LWServiceImpl", "Attempting to call JSBridge method on bound service with no registered listener", new Object[0]);
            azph.m85998a(this.f99213b).mo55135a(1911, 65, str2, (ConversationId) null);
        } else if (!azqn.f99904c.containsKey(str)) {
            azoj.m85933c("JsBridgeManager", "Failed to call method on nonexistent JSBridge %s", str);
            azph.m85998a(azqn.f99903b).mo55126a(1918, 65);
        } else {
            new Object[1][0] = str;
            azph.m85998a(azqn.f99903b).mo55125a(1917);
            ((azql) azqn.f99904c.get(str)).callNativeMethod(str2);
        }
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        azew azew;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.libraries.matchstick.net.ILighterWebListener");
                azew = queryLocalInterface instanceof azew ? (azew) queryLocalInterface : new azeu(readStrongBinder);
            } else {
                azew = null;
            }
            mo54856a(azew);
        } else if (i == 2) {
            mo54857a(parcel.readString(), parcel.readString());
        } else if (i != 3) {
            return false;
        } else {
            mo54855a();
        }
        return true;
    }
}
