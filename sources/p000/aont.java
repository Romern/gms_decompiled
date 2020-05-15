package p000;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/* renamed from: aont */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class aont extends BaseAdapter {

    /* renamed from: M */
    public final Context f78589M;

    /* renamed from: N */
    public final LayoutInflater f78590N;

    /* renamed from: O */
    protected final int f78591O = mo43112i();

    /* renamed from: P */
    public aonl f78592P = new aono();

    /* renamed from: a */
    private int f78593a = 0;

    public aont(Context context) {
        this.f78589M = context;
        this.f78590N = LayoutInflater.from(context);
    }

    /* renamed from: b */
    public static String m66177b(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str.substring(0, 1);
        }
        return null;
    }

    /* renamed from: a */
    public final View mo43102a(View view, int i) {
        return view == null ? this.f78590N.inflate(i, (ViewGroup) null) : view;
    }

    public final int getCount() {
        return this.f78592P.mo42055d();
    }

    public final Object getItem(int i) {
        return this.f78592P.mo11416b(i);
    }

    public final long getItemId(int i) {
        this.f78592P.mo11416b(i);
        return (long) i;
    }

    public final int getItemViewType(int i) {
        return this.f78592P.mo11412a(i);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        return this.f78592P.mo42053a(i, view, viewGroup, i > 0);
    }

    public final int getViewTypeCount() {
        return this.f78593a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo43101h() {
    }

    public final boolean hasStableIds() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final int mo43112i() {
        int i = this.f78593a;
        this.f78593a = i + 1;
        return i;
    }

    /* renamed from: a */
    public final String mo43103a(int i) {
        if (i != 0) {
            return this.f78589M.getResources().getString(i);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo43104a(aonl aonl) {
        this.f78592P = aonl;
        mo43101h();
        notifyDataSetChanged();
    }
}
