package p000;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: bjfa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bjfa extends Fragment {

    /* renamed from: a */
    public static final WeakHashMap f122602a = new WeakHashMap();

    /* renamed from: f */
    private static adzt f122603f;

    /* renamed from: b */
    public final ArrayList f122604b = new ArrayList();

    /* renamed from: c */
    public final C1246ol f122605c = new C1246ol(2);

    /* renamed from: d */
    public boolean f122606d = false;

    /* renamed from: e */
    public int f122607e;

    /* renamed from: g */
    private int f122608g = 0;

    /* renamed from: h */
    private bjex f122609h;

    /* renamed from: a */
    protected static bjfa m103278a(Activity activity) {
        bjfa bjfa = (bjfa) activity.getSupportFragmentManager().findFragmentByTag("ActionExecutorFragment");
        return bjfa == null ? (bjfa) f122602a.get(activity) : bjfa;
    }

    /* renamed from: c */
    public static adzt m103280c() {
        if (f122603f == null) {
            f122603f = new adzt(Looper.getMainLooper());
        }
        return f122603f;
    }

    /* renamed from: d */
    private final void m103281d() {
        this.f122606d = false;
        int c = this.f122605c.mo15640c();
        for (int i = 0; i < c; i++) {
            bjey bjey = ((bjez) this.f122605c.mo15641c(i)).f122601f;
            if (bjey != null) {
                bjey.f122590a = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract bjex mo52453a(Context context);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo52454a(AsyncTask asyncTask);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo65075a(bjfc bjfc) {
        throw null;
    }

    /* renamed from: b */
    public final void mo65076b() {
        bmxy.m108601b(this.f122606d, "Fragment must be resumed!");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo65077b(bjfc bjfc) {
        throw null;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1000) {
            Intent a = bjfd.m103295a(0);
            a.putExtra("resultCode", i2);
            a.putExtra("resultData", intent);
            mo65074a(new bjfd(a));
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        f122602a.remove(activity);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f122607e = bundle.getInt("nextExecutionId", -1);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("executions");
            int size = parcelableArrayList.size();
            for (int i = 0; i < size; i++) {
                bjez bjez = new bjez((Bundle) parcelableArrayList.get(i));
                this.f122605c.mo15637a(bjez.f122596a, bjez);
            }
            this.f122608g = bundle.getInt("executionIdWaitingForExternalExecutionResult");
        } else {
            this.f122607e = 1;
        }
        setRetainInstance(true);
        this.f122609h = mo52453a(getContext().getApplicationContext());
    }

    public final void onPause() {
        super.onPause();
        m103281d();
    }

    public final void onResume() {
        super.onResume();
        this.f122606d = true;
        int c = this.f122605c.mo15640c();
        for (int i = 0; i < c; i++) {
            bjey bjey = ((bjez) this.f122605c.mo15641c(i)).f122601f;
            if (bjey != null) {
                bjey.f122590a = this;
            }
        }
        int size = this.f122604b.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((Runnable) this.f122604b.get(i2)).run();
        }
        this.f122604b.clear();
        mo65073a();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        m103281d();
        bundle.putInt("nextExecutionId", this.f122607e);
        ArrayList arrayList = new ArrayList();
        int c = this.f122605c.mo15640c();
        for (int i = 0; i < c; i++) {
            bjez bjez = (bjez) this.f122605c.mo15641c(i);
            Bundle bundle2 = new Bundle();
            bundle2.putInt("executionId", bjez.f122596a);
            bjfc bjfc = bjez.f122598c;
            if (bjfc != null) {
                bundle2.putParcelable("request", bjfc.f122612a);
            }
            int i2 = bjez.f122599d;
            if (i2 == 3) {
                bundle2.putInt("state", i2);
            } else if (i2 != 4) {
                bundle2.putInt("state", 1);
            } else {
                bjfd bjfd = bjez.f122597b;
                if (bjfd != null) {
                    bundle2.putParcelable("response", bjfd.f122613a);
                }
                bundle2.putInt("state", bjez.f122599d);
            }
            arrayList.add(bundle2);
        }
        bundle.putInt("executionIdWaitingForExternalExecutionResult", this.f122608g);
        bundle.putParcelableArrayList("executions", arrayList);
    }

    /* renamed from: a */
    private static ArrayList m103279a(bjez bjez, ArrayList arrayList) {
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        bjfh bjfh = bjez.f122600e;
        if (bjfh != null) {
            arrayList.add(bjfh);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo65073a() {
        if (this.f122606d) {
            int c = this.f122605c.mo15640c();
            ArrayList arrayList = null;
            for (int i = 0; i < c; i++) {
                bjez bjez = (bjez) this.f122605c.mo15641c(i);
                int i2 = bjez.f122599d;
                if (i2 != 1) {
                    if (i2 == 2) {
                        bjey bjey = bjez.f122601f;
                        if (bjey.f122594e) {
                            bjez.f122597b = bjey.f122592c;
                            bjez.f122599d = 4;
                            arrayList = m103279a(bjez, arrayList);
                        }
                    } else if (i2 == 3 && this.f122608g != bjez.f122596a) {
                        bjez.f122599d = 4;
                        arrayList = m103279a(bjez, arrayList);
                    }
                } else if (bjez.f122600e == null) {
                    continue;
                } else if (!mo65075a(bjez.f122598c)) {
                    bjey bjey2 = new bjey();
                    bjey2.f122593d = bjez.f122598c;
                    bjey2.f122595f = (long) bjez.f122598c.f122612a.getIntExtra("timeOut", -1);
                    bjex bjex = this.f122609h;
                    if (bjex != null) {
                        bjey2.f122591b = bjex;
                        bjey2.f122590a = this;
                        bjez.f122601f = bjey2;
                        bjez.f122599d = 2;
                        mo52454a(bjey2);
                    } else {
                        throw new IllegalStateException("Should only be called after onCreate.");
                    }
                } else if (this.f122608g == 0) {
                    this.f122608g = bjez.f122596a;
                    bjez.f122599d = 3;
                    mo65077b(bjez.f122598c);
                }
            }
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((bjfh) arrayList.get(i3)).mo65085c();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo65074a(bjfd bjfd) {
        boolean z;
        if (this.f122608g != 0) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108601b(z, "No pending execution to deliver results to");
        bjez bjez = (bjez) this.f122605c.mo15646f(this.f122608g);
        bmxy.m108582a(bjez, "Cannot return result without valid execution.");
        this.f122608g = 0;
        bjez.f122597b = bjfd;
        mo65073a();
    }
}
