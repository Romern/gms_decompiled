package p000;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: bkai */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkai extends BaseAdapter implements Filterable {

    /* renamed from: a */
    public static final int f123792a = ((Integer) bjwe.f123486g.mo54082a()).intValue();

    /* renamed from: b */
    public final int f123793b;

    /* renamed from: c */
    public final String f123794c;

    /* renamed from: d */
    public final char f123795d;

    /* renamed from: e */
    final char[] f123796e;

    /* renamed from: f */
    public final char[] f123797f;

    /* renamed from: g */
    public final List f123798g;

    /* renamed from: h */
    ArrayList f123799h;

    /* renamed from: i */
    ArrayList f123800i;

    /* renamed from: j */
    CharSequence f123801j;

    /* renamed from: k */
    private final int f123802k;

    /* renamed from: l */
    private final LayoutInflater f123803l;

    /* renamed from: m */
    private bkah f123804m;

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0058  */
    public bkai(ContextThemeWrapper contextThemeWrapper, int i, String str, char c, char[] cArr, String str2, List list) {
        int length;
        char[] cArr2;
        if (cArr == null || cArr.length == 0) {
            throw new IllegalArgumentException("remainingFields are required");
        } else if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("addressSources are required");
        } else {
            this.f123802k = C0126R.C0128layout.view_row_address_hint_spinner;
            this.f123793b = i;
            this.f123794c = str;
            this.f123795d = c;
            int i2 = 0;
            while (true) {
                length = cArr.length;
                if (i2 < length && !bjtf.m104553a(cArr[i2])) {
                    i2++;
                } else if (i2 >= length) {
                    this.f123796e = Arrays.copyOfRange(cArr, i2, length);
                    if (str2 != null) {
                        cArr2 = str2.toCharArray();
                    } else {
                        cArr2 = null;
                    }
                    this.f123797f = cArr2;
                    this.f123798g = new ArrayList(list);
                    this.f123803l = LayoutInflater.from(contextThemeWrapper);
                    this.f123799h = new ArrayList();
                    this.f123800i = new ArrayList();
                    return;
                } else {
                    throw new IllegalArgumentException("fields must contain at least one valid field");
                }
            }
            if (i2 >= length) {
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    private final View m105092a(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f123803l.inflate(this.f123802k, viewGroup, false);
        }
        ((TextView) view.findViewById(C0126R.C0129id.description)).setText(getItem(i).f123276e);
        return view;
    }

    public final int getCount() {
        return this.f123799h.size();
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return m105092a(i, view, viewGroup);
    }

    public final Filter getFilter() {
        if (this.f123804m == null) {
            this.f123804m = new bkah(this);
        }
        return this.f123804m;
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        return m105092a(i, view, viewGroup);
    }

    /* renamed from: a */
    public final bjtj getItem(int i) {
        return (bjtj) this.f123799h.get(i);
    }
}
