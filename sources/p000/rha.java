package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import java.util.List;

/* renamed from: rha */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rha extends rgn {

    /* renamed from: e */
    private final boolean f42951e;

    /* renamed from: f */
    private final int f42952f;

    /* renamed from: g */
    private final int f42953g;

    public rha(Context context, List list, boolean z) {
        super(context, list);
        this.f42951e = z;
        this.f42952f = list != null ? list.size() : 0;
        this.f42953g = C0126R.C0128layout.common_account_add_account_chip_view;
    }

    public final int getCount() {
        return this.f42951e ? this.f42952f + 1 : this.f42952f;
    }

    public final int getItemViewType(int i) {
        return i == this.f42952f ? 1 : 0;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (i == this.f42952f) {
            return view == null ? this.f42926a.inflate(this.f42953g, viewGroup, false) : view;
        }
        return super.getView(i, view, viewGroup);
    }

    public final int getViewTypeCount() {
        return 2;
    }
}
