package p000;

import android.app.Activity;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.internal.PopupLocationInfoParcelable;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;

/* renamed from: aaef */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaef extends sbm {

    /* renamed from: a */
    public boolean f27991a = false;

    /* renamed from: b */
    private final aaeo f27992b = new aaeo();

    /* renamed from: c */
    private final String f27993c;

    /* renamed from: d */
    private final aaem f27994d;

    /* renamed from: e */
    private boolean f27995e = false;

    /* renamed from: f */
    private final long f27996f;

    /* renamed from: g */
    private final aacv f27997g;

    /* renamed from: a */
    public static void m21137a(RemoteException remoteException) {
        aaeg.m21155a("GamesGmsClientImpl", "service died", remoteException);
    }

    /* renamed from: H */
    public final boolean mo16778H() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.games.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.games.internal.IGamesService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 12451000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final Bundle mo12238f() {
        String locale = this.f43948r.getResources().getConfiguration().locale.toString();
        aacv aacv = this.f27997g;
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.games.key.isHeadless", aacv.f27955a);
        bundle.putBoolean("com.google.android.gms.games.key.showConnectingPopup", aacv.f27956b);
        bundle.putInt("com.google.android.gms.games.key.connectingPopupGravity", aacv.f27957c);
        bundle.putBoolean("com.google.android.gms.games.key.retryingSignIn", aacv.f27958d);
        bundle.putInt("com.google.android.gms.games.key.sdkVariant", aacv.f27959e);
        bundle.putString("com.google.android.gms.games.key.forceResolveAccountKey", aacv.f27960f);
        bundle.putStringArrayList("com.google.android.gms.games.key.proxyApis", aacv.f27961g);
        bundle.putBoolean("com.google.android.gms.games.key.unauthenticated", aacv.f27962h);
        bundle.putBoolean("com.google.android.gms.games.key.skipWelcomePopup", aacv.f27963i);
        bundle.putParcelable("com.google.android.gms.games.key.googleSignInAccount", aacv.f27964j);
        bundle.putString("com.google.android.gms.games.key.realClientPackageName", aacv.f27965k);
        bundle.putInt("com.google.android.gms.games.key.API_VERSION", aacv.f27967m);
        bundle.putString("com.google.android.gms.games.key.gamePackageName", this.f27993c);
        bundle.putString("com.google.android.gms.games.key.desiredLocale", locale);
        bundle.putParcelable("com.google.android.gms.games.key.popupWindowToken", new BinderWrapper(this.f27994d.f28008b.f28001a));
        if (!bundle.containsKey("com.google.android.gms.games.key.API_VERSION")) {
            bundle.putInt("com.google.android.gms.games.key.API_VERSION", 7);
        }
        bundle.putBundle("com.google.android.gms.games.key.signInOptions", aqoj.m71863a(this.f44003H));
        return bundle;
    }

    /* renamed from: g */
    public final boolean mo12787g() {
        aacv aacv = this.f27997g;
        return aacv.f27965k == null && !aacv.f27962h;
    }

    /* renamed from: j */
    public final void mo14032j() {
        this.f27995e = false;
        if (mo25301p()) {
            try {
                this.f27992b.mo16795a();
                aaej aaej = (aaej) mo25289B();
                long j = this.f27996f;
                Parcel bj = aaej.mo8529bj();
                bj.writeLong(j);
                aaej.mo8528b(5001, bj);
            } catch (RemoteException e) {
                aaeg.m21157b("GamesGmsClientImpl", "Failed to notify client disconnect.");
            }
        }
        super.mo14032j();
    }

    /* renamed from: m */
    public final Bundle mo16784m() {
        try {
            aaej aaej = (aaej) mo25289B();
            Parcel a = aaej.mo8526a(5004, aaej.mo8529bj());
            Bundle bundle = (Bundle) dcl.m8163a(a, Bundle.CREATOR);
            a.recycle();
            if (bundle != null) {
                bundle.setClassLoader(aaef.class.getClassLoader());
            }
            return bundle;
        } catch (RemoteException e) {
            m21137a(e);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo16785n() {
        if (mo25301p()) {
            try {
                aaej aaej = (aaej) mo25289B();
                aaej.mo8528b(5006, aaej.mo8529bj());
            } catch (RemoteException e) {
                m21137a(e);
            }
        }
    }

    /* renamed from: u */
    public final Set mo16786u() {
        return this.f44004I;
    }

    public aaef(Context context, Looper looper, sat sat, aacv aacv, rjz rjz, rka rka) {
        super(context, looper, 1, sat, rjz, rka);
        this.f27993c = sat.f43967e;
        new Binder();
        this.f27994d = new aaem(this);
        this.f27996f = (long) hashCode();
        this.f27997g = aacv;
        if (!aacv.f27962h && (context instanceof Activity)) {
            aaem aaem = this.f27994d;
            aaem.f28007a.mo16785n();
            WeakReference weakReference = aaem.f28009c;
            if (weakReference != null) {
                View view = (View) weakReference.get();
                Context context2 = aaem.f28007a.f43948r;
                if (view == null && (context2 instanceof Activity)) {
                    view = ((Activity) context2).getWindow().getDecorView();
                }
                if (view != null) {
                    view.removeOnAttachStateChangeListener(aaem);
                    ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                    int i = Build.VERSION.SDK_INT;
                    viewTreeObserver.removeOnGlobalLayoutListener(aaem);
                }
            }
            View view2 = null;
            aaem.f28009c = null;
            Context context3 = aaem.f28007a.f43948r;
            if (context3 instanceof Activity) {
                Activity activity = (Activity) context3;
                view2 = activity.findViewById(16908290);
                view2 = view2 == null ? activity.getWindow().getDecorView() : view2;
                aaeg.m21157b("PopupManager", "You have not specified a View to use as content view for popups. Falling back to the Activity content view. Note that this may not work as expected in multi-screen environments");
            }
            if (view2 != null) {
                aaem.mo16791a(view2);
                aaem.f28009c = new WeakReference(view2);
                view2.addOnAttachStateChangeListener(aaem);
                view2.getViewTreeObserver().addOnGlobalLayoutListener(aaem);
                return;
            }
            aaeg.m21159c("PopupManager", "No content view usable to display popups. Popups will not be displayed in response to this client's calls. Use setViewForPopups() to set your content view.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.games.internal.IGamesService");
        if (queryLocalInterface instanceof aaej) {
            return (aaej) queryLocalInterface;
        }
        return new aaej(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Set mo16779a(Set set) {
        boolean z;
        HashSet hashSet = new HashSet(set);
        boolean contains = set.contains(aacw.f27968a);
        boolean contains2 = set.contains(aacw.f27969b);
        if (set.contains(aacw.f27971d)) {
            sdo.m34972a(!contains, "Cannot have both %s and %s!", "https://www.googleapis.com/auth/games", "https://www.googleapis.com/auth/games.firstparty");
        } else {
            if (contains) {
                z = true;
            } else {
                z = contains2;
            }
            sdo.m34972a(z, "Games APIs requires %s function.", "https://www.googleapis.com/auth/games_lite");
            if (contains2 && contains) {
                hashSet.remove(aacw.f27969b);
            }
        }
        return hashSet;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo16780a(int i, IBinder iBinder, Bundle bundle, int i2) {
        if (i == 0 && bundle != null) {
            bundle.setClassLoader(aaef.class.getClassLoader());
            boolean z = bundle.getBoolean("show_welcome_popup");
            this.f27995e = z;
            this.f27991a = z;
            PlayerEntity playerEntity = (PlayerEntity) bundle.getParcelable("com.google.android.gms.games.current_player");
            GameEntity gameEntity = (GameEntity) bundle.getParcelable("com.google.android.gms.games.current_game");
        }
        super.mo16780a(i, iBinder, bundle, i2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo16781a(IInterface iInterface) {
        aaej aaej = (aaej) iInterface;
        super.mo16781a(aaej);
        if (this.f27995e) {
            this.f27994d.mo16790a();
            this.f27995e = false;
        }
        aacv aacv = this.f27997g;
        if (!aacv.f27955a && !aacv.f27962h) {
            try {
                aaed aaed = new aaed(new PopupLocationInfoParcelable(this.f27994d.f28008b));
                long j = this.f27996f;
                Parcel bj = aaej.mo8529bj();
                dcl.m8164a(bj, aaed);
                bj.writeLong(j);
                aaej.mo8528b(15501, bj);
            } catch (RemoteException e) {
                m21137a(e);
            }
        }
    }

    /* renamed from: a */
    public final void mo16782a(ConnectionResult connectionResult) {
        super.mo16782a(connectionResult);
        this.f27995e = false;
    }

    /* renamed from: a */
    public final void mo16783a(rnh rnh) {
        try {
            aaee aaee = new aaee(rnh);
            this.f27992b.mo16795a();
            try {
                aaej aaej = (aaej) mo25289B();
                aaec aaec = new aaec(aaee);
                Parcel bj = aaej.mo8529bj();
                dcl.m8164a(bj, aaec);
                aaej.mo8528b(5002, bj);
            } catch (SecurityException e) {
                aaee.mo9481a(new Status(4, rjs.m33677c(4)));
            }
        } catch (RemoteException e2) {
            rnh.mo24924a();
        }
    }
}
