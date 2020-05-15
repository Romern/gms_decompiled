package p000;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.car.libs.cakewalk.bottomsheets.BottomSheetView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: ozg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ozg extends oyj {

    /* renamed from: d */
    public static final bnsn f38651d = odk.m28481a("CAR.SETUP.FRX");

    /* renamed from: a */
    static void m30034a(Activity activity, View view, int i, int i2, int i3) {
        ((ImageView) view.findViewById(C0126R.C0129id.bs_illustration)).setImageDrawable(activity.getDrawable(i));
        TextView textView = (TextView) view.findViewById(C0126R.C0129id.bs_title);
        if (i2 != 0) {
            textView.setText(i2);
        } else {
            textView.setVisibility(8);
        }
        TextView textView2 = (TextView) view.findViewById(C0126R.C0129id.bs_body);
        if (i3 != 0) {
            textView2.setText(i3);
        } else {
            textView2.setVisibility(8);
        }
    }

    /* renamed from: a */
    public abstract bpeb mo22789a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final ozj mo22803b() {
        bmxy.m108601b(isAdded(), "Called SetupBaseFragment#getController while detached from Activity");
        Activity activity = getActivity();
        sdo.m34959a(activity);
        return ((ozf) activity).mo17470e();
    }

    public void onStart() {
        super.onStart();
        mo22803b().f38656b.mo22797a(mo22789a(), bpea.SCREEN_VIEW);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, com.google.android.gms.car.libs.cakewalk.bottomsheets.BottomSheetView, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final View mo22801a(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, boolean z) {
        int i2;
        boolean z2 = false;
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.car_bottom_sheet_fragment, viewGroup, false);
        BottomSheetView bottomSheetView = (BottomSheetView) inflate.findViewById(C0126R.C0129id.bottom_sheet);
        bottomSheetView.addView(layoutInflater.inflate(i, (ViewGroup) bottomSheetView, false));
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        oze oze = new oze(this);
        View findViewById = inflate.findViewById(C0126R.C0129id.bottom_sheet_fragment_background);
        if (bottomSheetView.f29497a == null) {
            bottomSheetView.f29497a = BottomSheetBehavior.m117480e(bottomSheetView);
        }
        Context context = bottomSheetView.getContext();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        bottomSheetView.f29497a.mo71025a(displayMetrics.heightPixels - context.getResources().getDimensionPixelSize(C0126R.dimen.bottom_sheet_peek_height_buffer));
        bottomSheetView.f29497a.mo71035b(true);
        BottomSheetBehavior bottomSheetBehavior = bottomSheetView.f29497a;
        bottomSheetBehavior.f151097k = true;
        bottomSheetBehavior.mo71037c(5);
        int identifier = bottomSheetView.getResources().getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            i2 = bottomSheetView.getResources().getDimensionPixelSize(identifier);
        } else {
            i2 = 0;
        }
        bottomSheetView.setPadding(bottomSheetView.getPaddingLeft(), bottomSheetView.getPaddingTop(), bottomSheetView.getPaddingRight(), bottomSheetView.getPaddingBottom() + i2);
        bottomSheetView.f29497a.mo71034b(new obz(oze));
        findViewById.setOnClickListener(new obx(bottomSheetView));
        if (bottomSheetView.f29497a != null) {
            z2 = true;
        }
        bmxy.m108601b(z2, "BottomSheetView::initializeBottomSheet must be called first");
        if (z) {
            new adzt().postDelayed(new obw(bottomSheetView), 40);
        } else {
            bottomSheetView.f29497a.mo71037c(4);
        }
        return inflate;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final View mo22802a(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return mo22801a(activity, layoutInflater, viewGroup, (int) C0126R.C0128layout.bottom_sheet_apps, z);
    }
}
