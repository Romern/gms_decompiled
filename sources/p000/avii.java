package p000;

import android.os.Looper;
import android.os.Message;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.LoaderManager;

/* renamed from: avii */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avii extends adzt {

    /* renamed from: a */
    private final Activity f93230a;

    public avii(Activity activity) {
        super(Looper.getMainLooper());
        this.f93230a = activity;
    }

    /* renamed from: a */
    public final void mo51268a(int i, LoaderManager.LoaderCallbacks loaderCallbacks) {
        sendMessage(obtainMessage(3, i, 0, loaderCallbacks));
    }

    /* renamed from: b */
    public final void mo51270b(int i, LoaderManager.LoaderCallbacks loaderCallbacks) {
        sendMessage(obtainMessage(4, i, 0, loaderCallbacks));
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            this.f93230a.getSupportFragmentManager().beginTransaction().replace(message.arg1, (Fragment) message.obj, Integer.toString(message.arg2)).commitAllowingStateLoss();
        } else if (i == 2) {
            ((DialogFragment) message.obj).dismiss();
        } else if (i == 3) {
            this.f93230a.getSupportLoaderManager().initLoader(message.arg1, null, (LoaderManager.LoaderCallbacks) message.obj);
        } else if (i == 4) {
            this.f93230a.getSupportLoaderManager().restartLoader(message.arg1, null, (LoaderManager.LoaderCallbacks) message.obj);
        } else if (i == 5) {
            ((DialogFragment) message.obj).show(this.f93230a.getSupportFragmentManager(), "UdcDialog");
        }
    }

    /* renamed from: a */
    public final void mo51269a(Fragment fragment) {
        sendMessage(obtainMessage(1, 16908290, 0, fragment));
    }
}
