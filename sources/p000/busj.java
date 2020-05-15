package p000;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.support.p002v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: busj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class busj extends dck implements busk {

    /* renamed from: a */
    public final Handler f154813a;

    /* renamed from: b */
    public WeakReference f154814b;

    /* renamed from: c */
    private final WeakReference f154815c;

    /* renamed from: d */
    private final String f154816d;

    public busj() {
        super("com.google.location.nearby.common.fastpair.autotest.IAutoTestServiceCallback");
    }

    /* renamed from: a */
    private final View m120381a(String str) {
        Object obj;
        Context context = (Context) this.f154815c.get();
        if (context == null) {
            Log.w("AutoTestUiInjector", "Error! getViewFromFragment failed because context is null!");
            return null;
        }
        WeakReference weakReference = this.f154814b;
        if (weakReference != null) {
            obj = weakReference.get();
        } else {
            obj = null;
        }
        if (obj == null) {
            Log.w("AutoTestUiInjector", "Error! getViewFromFragment failed because targetFragment is null!");
            return null;
        }
        Method a = m120382a(obj, "getView");
        if (a == null) {
            Log.w("AutoTestUiInjector", "Error! Find Fragment.getView failed!");
            return null;
        }
        int identifier = context.getResources().getIdentifier(str, "id", this.f154816d);
        if (identifier <= 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 23);
            sb.append("Error! Can't find id: ");
            sb.append(str);
            sb.append("!");
            Log.w("AutoTestUiInjector", sb.toString());
            return null;
        }
        try {
            return ((View) a.invoke(obj, new Object[0])).findViewById(identifier);
        } catch (IllegalAccessException | InvocationTargetException e) {
            Log.w("AutoTestUiInjector", "Error! Meet exception when calling getViewFromFragment!", e);
            return null;
        }
    }

    public busj(WeakReference weakReference, String str) {
        super("com.google.location.nearby.common.fastpair.autotest.IAutoTestServiceCallback");
        this.f154815c = weakReference;
        this.f154816d = str;
        this.f154813a = new Handler(Looper.getMainLooper());
    }

    /* renamed from: a */
    private static Method m120382a(Object obj, String str) {
        Method[] methods = obj.getClass().getMethods();
        for (Method method : methods) {
            if (str.equals(method.getName())) {
                return method;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m120383a(RecyclerView recyclerView) {
        if (recyclerView.getChildCount() <= 0) {
            return false;
        }
        if (recyclerView.getChildCount() == 1) {
            return recyclerView.getChildAt(0).isClickable();
        }
        return true;
    }

    /* renamed from: a */
    public final void mo73083a(RecyclerView recyclerView, String str, String str2) {
        int i;
        Context context = (Context) this.f154815c.get();
        if (context == null) {
            Log.w("AutoTestUiInjector", "Error! clickItemOnRecyclerView failed because context is null!");
            return;
        }
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            i = context.getResources().getIdentifier(str, "id", this.f154816d);
        }
        if (i <= 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 49);
            sb.append("Error! Can't find id: ");
            sb.append(str);
            sb.append(" for recyclerViewItemTitle!");
            Log.w("AutoTestUiInjector", sb.toString());
            return;
        }
        int childCount = recyclerView.getChildCount();
        StringBuilder sb2 = new StringBuilder(41);
        sb2.append("Check adapter with item count ");
        sb2.append(childCount);
        Log.w("AutoTestUiInjector", sb2.toString());
        for (int i2 = 0; i2 < recyclerView.getChildCount(); i2++) {
            View childAt = recyclerView.getChildAt(i2);
            TextView textView = (TextView) childAt.findViewById(i);
            if (textView == null) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 50);
                sb3.append("Doesn't find view with id ");
                sb3.append(str);
                sb3.append(" from recycle view item!");
                Log.w("AutoTestUiInjector", sb3.toString());
            } else if (str2.contentEquals(textView.getText())) {
                childAt.performClick();
                String valueOf = String.valueOf(str2);
                Log.w("AutoTestUiInjector", valueOf.length() == 0 ? new String("Find item with name: ") : "Find item with name: ".concat(valueOf));
                return;
            }
        }
        String valueOf2 = String.valueOf(str2);
        Log.w("AutoTestUiInjector", valueOf2.length() == 0 ? new String("Error! Don't find any item with name: ") : "Error! Don't find any item with name: ".concat(valueOf2));
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        boolean z = false;
        if (i == 2) {
            String readString = parcel.readString();
            View a = m120381a(readString);
            if (a == null) {
                StringBuilder sb = new StringBuilder(String.valueOf(readString).length() + 32);
                sb.append("Error! Can't find view for id: ");
                sb.append(readString);
                sb.append("!");
                Log.w("AutoTestUiInjector", sb.toString());
            } else {
                this.f154813a.post(new buqp(a));
                z = true;
            }
            parcel2.writeNoException();
            dcl.m8166a(parcel2, z);
        } else if (i == 3) {
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            RecyclerView recyclerView = (RecyclerView) m120381a(readString2);
            if (recyclerView == null) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(readString2).length() + 32);
                sb2.append("Error! Can't find view for id: ");
                sb2.append(readString2);
                sb2.append("!");
                Log.w("AutoTestUiInjector", sb2.toString());
            } else {
                this.f154813a.post(new buqq(this, recyclerView, readString3, readString4, recyclerView.getAdapter()));
                z = true;
            }
            parcel2.writeNoException();
            dcl.m8166a(parcel2, z);
        } else if (i == 4) {
            Context context = (Context) this.f154815c.get();
            if (context == null) {
                Log.w("AutoTestUiInjector", "Error! clickItemOnRecyclerView failed because context is null!");
            } else {
                Method a2 = m120382a(context, "finish");
                if (a2 == null) {
                    Log.w("AutoTestUiInjector", "Error! Find Activity.finish failed!");
                } else {
                    try {
                        a2.invoke(context, new Object[0]);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        Log.w("AutoTestUiInjector", "Error! Meet exception when calling Activity.finish!", e);
                    }
                }
            }
            parcel2.writeNoException();
        } else if (i != 5) {
            return false;
        } else {
            boolean a3 = mo73084a(parcel.readString(), parcel.readString());
            parcel2.writeNoException();
            dcl.m8166a(parcel2, a3);
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo73084a(String str, String str2) {
        Method method;
        WeakReference weakReference = this.f154814b;
        Object obj = weakReference != null ? weakReference.get() : null;
        if (obj == null) {
            Log.w("AutoTestUiInjector", "Error! invokeStringMethod failed because targetFragment is null!");
            return false;
        }
        Method a = m120382a(obj, str);
        if (a == null) {
            try {
                method = obj.getClass().getDeclaredMethod(str, String.class);
            } catch (NoSuchMethodException e) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 27);
                sb.append("Error! Find method ");
                sb.append(str);
                sb.append(" failed!");
                Log.w("AutoTestUiInjector", sb.toString());
                return false;
            }
        } else {
            method = a;
        }
        method.setAccessible(true);
        bqgy c = bqgy.m112818c();
        this.f154813a.post(new buqr(method, obj, str2, c, str));
        try {
            return ((Boolean) c.get(15000, TimeUnit.MICROSECONDS)).booleanValue();
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            return false;
        }
    }
}
