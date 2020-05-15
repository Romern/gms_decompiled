package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;
import java.util.Iterator;
import java.util.Map;

/* renamed from: fop */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fop extends avh implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: c */
    private static final int[] f17024c = {0, 1, 3};

    /* renamed from: b */
    public Map f17025b;

    /* renamed from: d */
    private Context f17026d;

    /* renamed from: e */
    private Map f17027e;

    /* renamed from: f */
    private boolean f17028f;

    /* renamed from: g */
    private boolean f17029g;

    /* renamed from: h */
    private boolean f17030h;

    /* renamed from: i */
    private final FragmentManager f17031i;

    /* renamed from: j */
    private FragmentTransaction f17032j = null;

    /* renamed from: k */
    private final Map f17033k = new C1223np();

    /* renamed from: l */
    private Fragment f17034l = null;

    public fop(FragmentManager fragmentManager, Context context) {
        this.f17031i = fragmentManager;
        this.f17026d = context;
        SharedPreferences sharedPreferences = context.getSharedPreferences("NetworkUsagePrefs", 0);
        this.f17028f = sharedPreferences.getBoolean("CELLULAR_TAB_ENABLE", false);
        this.f17029g = sharedPreferences.getBoolean("WIFI_TAB_ENABLE", false);
        this.f17030h = sharedPreferences.getBoolean("ETHERNET_TAB_ENABLE", false);
        this.f17025b = new C1223np();
        this.f17027e = new C1223np();
        for (int i : f17024c) {
            this.f17027e.put(Integer.valueOf(i), -1);
        }
        mo11071b(0);
        mo11071b(1);
        mo11071b(3);
    }

    /* renamed from: e */
    private final Fragment m12092e(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("ARG_NETWORK_TYPE", i);
        foo foo = new foo();
        foo.setArguments(bundle);
        this.f17025b.put(Integer.valueOf(i), foo);
        return foo;
    }

    /* renamed from: a */
    public final int mo2709a() {
        int i = this.f17028f;
        if (this.f17029g) {
            i++;
        }
        return this.f17030h ? i + 1 : i;
    }

    /* renamed from: b */
    public final Parcelable mo2717b() {
        Bundle bundle;
        int i = 0;
        if (!this.f17033k.isEmpty()) {
            bundle = new Bundle();
            Fragment.SavedState[] savedStateArr = new Fragment.SavedState[f17024c.length];
            int i2 = 0;
            while (true) {
                int[] iArr = f17024c;
                if (i2 >= iArr.length) {
                    break;
                }
                savedStateArr[i2] = (Fragment.SavedState) this.f17033k.get(Integer.valueOf(iArr[i2]));
                i2++;
            }
            bundle.putParcelableArray("states", savedStateArr);
        } else {
            bundle = null;
        }
        while (true) {
            int[] iArr2 = f17024c;
            if (i >= iArr2.length) {
                return bundle;
            }
            Fragment fragment = (Fragment) this.f17025b.get(Integer.valueOf(iArr2[i]));
            if (fragment != null && fragment.isAdded()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                int i3 = f17024c[i];
                StringBuilder sb = new StringBuilder(12);
                sb.append("f");
                sb.append(i3);
                this.f17031i.putFragment(bundle, sb.toString(), fragment);
            }
            i++;
        }
    }

    /* renamed from: d */
    public final void mo2721d() {
        FragmentTransaction fragmentTransaction = this.f17032j;
        if (fragmentTransaction != null) {
            fragmentTransaction.commitAllowingStateLoss();
            this.f17032j = null;
            this.f17031i.executePendingTransactions();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo11072d(int i) {
        if (i == 0) {
            return this.f17028f;
        }
        if (i == 1) {
            return this.f17029g;
        }
        if (i != 3) {
            return false;
        }
        return this.f17030h;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        boolean z;
        boolean z2;
        boolean equals = str.equals("CELLULAR_TAB_ENABLE");
        boolean equals2 = str.equals("WIFI_TAB_ENABLE");
        boolean equals3 = str.equals("ETHERNET_TAB_ENABLE");
        int i = 1;
        int i2 = 0;
        if (equals) {
            z = sharedPreferences.getBoolean(str, false);
            boolean z3 = this.f17028f;
            if (z != z3) {
                this.f17028f = z;
            } else {
                z = z3;
                i = 0;
            }
            i2 = i;
            i = 0;
        } else if (equals2) {
            z = sharedPreferences.getBoolean(str, false);
            boolean z4 = this.f17029g;
            if (z != z4) {
                this.f17029g = z;
                i2 = 1;
            } else {
                z = z4;
            }
        } else if (equals3) {
            boolean z5 = sharedPreferences.getBoolean(str, false);
            boolean z6 = this.f17030h;
            if (z5 != z6) {
                this.f17030h = z5;
                z2 = z5;
            } else {
                z2 = z6;
                i = 0;
            }
            z = z2;
            i2 = i;
            i = 3;
        } else {
            i = -1;
            z = false;
        }
        if (i >= 0 && i2 != 0) {
            if (z) {
                mo11071b(i);
            } else if (!mo11072d(i)) {
                this.f17025b.remove(Integer.valueOf(i));
                mo2720c();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo11070a(int i) {
        if (i < 0 || i >= f17024c.length) {
            return -1;
        }
        if (((C1245ok) this.f17025b).f26809h >= 3) {
            return f17024c[i];
        }
        int i2 = 0;
        if (mo11072d(0)) {
            if (i == 0) {
                return 0;
            }
            i2 = 1;
        }
        if (mo11072d(1)) {
            if (i == i2) {
                return 1;
            }
            i2++;
        }
        return (!mo11072d(3) || i != i2) ? -1 : 3;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ CharSequence mo2719c(int i) {
        int a = mo11070a(i);
        if (a == -1) {
            return null;
        }
        if (a == 0) {
            return this.f17026d.getResources().getString(C0126R.string.data_usage_tab_mobile);
        }
        if (a == 1) {
            return this.f17026d.getResources().getString(C0126R.string.data_usage_tab_wifi);
        }
        if (a != 3) {
            return null;
        }
        return this.f17026d.getResources().getString(C0126R.string.data_usage_tab_ethernet);
    }

    /* renamed from: a */
    public final int mo2710a(Object obj) {
        int i;
        int i2;
        try {
            int i3 = ((foo) obj).f17021a;
            Map map = this.f17027e;
            Integer valueOf = Integer.valueOf(i3);
            Integer num = (Integer) map.get(valueOf);
            if (num != null) {
                i = num.intValue();
            } else {
                i = -1;
            }
            int i4 = -2;
            if (i3 != 0) {
                if (i3 == 1) {
                    i2 = this.f17028f;
                    if (!this.f17029g) {
                    }
                } else if (i3 != 3) {
                    i4 = -1;
                } else {
                    i2 = this.f17028f;
                    if (this.f17029g) {
                        i2++;
                    }
                    if (!this.f17030h) {
                    }
                }
                i4 = i2;
            } else if (this.f17028f) {
                i4 = 0;
            }
            this.f17027e.put(valueOf, Integer.valueOf(i4));
            if (i4 != i) {
                return i4;
            }
            return -1;
        } catch (ClassCastException e) {
            return -1;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo11071b(int i) {
        if (this.f17025b.get(Integer.valueOf(i)) == null && mo11072d(i)) {
            m12092e(i);
            mo2720c();
        }
    }

    /* renamed from: b */
    public final void mo2718b(Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f17034l;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                this.f17034l.setUserVisibleHint(false);
            }
            if (fragment != null) {
                fragment.setMenuVisibility(true);
                fragment.setUserVisibleHint(true);
            }
            this.f17034l = fragment;
        }
    }

    /* renamed from: a */
    public final Object mo2711a(ViewGroup viewGroup, int i) {
        Fragment fragment;
        int a = mo11070a(i);
        Fragment fragment2 = null;
        if (a != -1) {
            fragment = (Fragment) this.f17025b.get(Integer.valueOf(a));
        } else {
            fragment = null;
        }
        if (fragment != null && this.f17031i.equals(fragment.getFragmentManager())) {
            return fragment;
        }
        if (this.f17032j == null) {
            this.f17032j = this.f17031i.beginTransaction();
        }
        if (fragment == null) {
            int a2 = mo11070a(i);
            if (a2 != -1 && (fragment2 = (Fragment) this.f17025b.get(Integer.valueOf(a2))) == null) {
                fragment2 = m12092e(a2);
            }
        } else {
            fragment2 = fragment;
        }
        Fragment.SavedState savedState = (Fragment.SavedState) this.f17033k.get(Integer.valueOf(a));
        if (savedState != null) {
            fragment2.setInitialSavedState(savedState);
        }
        fragment2.setMenuVisibility(false);
        fragment2.setUserVisibleHint(false);
        this.f17032j.add(viewGroup.getId(), fragment2);
        return fragment2;
    }

    /* renamed from: a */
    public final void mo2713a(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.f17033k.clear();
            this.f17025b.clear();
            if (parcelableArray != null && parcelableArray.length == f17024c.length) {
                for (int i = 0; i < parcelableArray.length; i++) {
                    this.f17033k.put(Integer.valueOf(f17024c[i]), (Fragment.SavedState) parcelableArray[i]);
                }
            }
            Iterator<T> it = bundle.keySet().iterator();
            while (it.hasNext()) {
                T t = (String) it.next();
                if (t.startsWith("f")) {
                    int parseInt = Integer.parseInt(t.substring(1));
                    Fragment fragment = this.f17031i.getFragment(bundle, t);
                    if (fragment != null) {
                        try {
                            fragment.setMenuVisibility(false);
                            this.f17025b.put(Integer.valueOf(parseInt), (foo) fragment);
                        } catch (ClassCastException e) {
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo2715a(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f17032j == null) {
            this.f17032j = this.f17031i.beginTransaction();
        }
        if (fragment != null && this.f17031i.equals(fragment.getFragmentManager())) {
            int a = mo11070a(i);
            if (a >= 0) {
                Map map = this.f17033k;
                Integer valueOf = Integer.valueOf(a);
                map.put(valueOf, this.f17031i.saveFragmentInstanceState(fragment));
                this.f17025b.remove(valueOf);
            }
            this.f17032j.remove(fragment);
        }
    }

    /* renamed from: a */
    public final boolean mo2716a(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }
}
