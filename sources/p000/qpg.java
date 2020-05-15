package p000;

import android.support.constraint.ConstraintLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: qpg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class qpg implements qoz {

    /* renamed from: a */
    private final String f41914a;

    /* renamed from: b */
    private final float f41915b;

    public qpg(String str, float f) {
        this.f41914a = str;
        this.f41915b = f;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final View mo24186a(LayoutInflater layoutInflater, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = layoutInflater.inflate((int) C0126R.C0128layout.list_item_header, viewGroup, false);
        }
        ((TextView) view.findViewById(C0126R.C0129id.title)).setText(this.f41914a);
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(C0126R.C0129id.container);
        C0971eu euVar = (C0971eu) constraintLayout.getLayoutParams();
        euVar.setMargins(0, (int) this.f41915b, 0, 0);
        constraintLayout.setLayoutParams(euVar);
        return view;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo24187a() {
        return this.f41914a;
    }

    /* renamed from: b */
    public final int mo24188b() {
        return 0;
    }
}
