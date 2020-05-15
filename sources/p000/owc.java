package p000;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;

/* renamed from: owc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class owc extends oxu {

    /* renamed from: a */
    public static final bnsn f38519a = odk.m28481a("CAR.SETUP");

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo22715a(DialogInterface dialogInterface, int i) {
        mo22762a(bpea.FRX_SCREEN_CANCELLED);
        bnsi b = f38519a.mo68387b();
        b.mo68432a("owc", "a", 102, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        b.mo68405a("Critical error: user aborted car connection");
        mo22763b().mo22754a("EVENT_CAR_CONNECTION_CANCELLED");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo22716b(DialogInterface dialogInterface, int i) {
        mo22762a(bpea.FRX_SCREEN_REJECT);
        bnsi b = f38519a.mo68387b();
        b.mo68432a("owc", "b", 93, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        b.mo68405a("Critical error: user rejected car connection permanently");
        ((oxk) mo22763b().f38582k).mo22671b(false);
        mo22763b().mo22754a("EVENT_CAR_CONNECTION_DISALLOWED");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Activity activity = getActivity();
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.car_frx_authorizing_car_connection, viewGroup, false);
        owl.m29905a(layoutInflater, (ViewGroup) inflate);
        ((ImageView) inflate.findViewById(C0126R.C0129id.illustration)).setImageDrawable(activity.getDrawable(C0126R.C0127drawable.car_permission_illustration));
        Button button = (Button) inflate.findViewById(C0126R.C0129id.left_button);
        TextView textView = (TextView) inflate.findViewById(C0126R.C0129id.bluetooth);
        TextView textView2 = (TextView) inflate.findViewById(C0126R.C0129id.notifications);
        Button button2 = (Button) inflate.findViewById(C0126R.C0129id.right_button);
        button2.setText(getString(C0126R.string.common_continue));
        button2.setOnClickListener(new ovy(this));
        button2.setVisibility(0);
        button.setText(getString(C0126R.string.car_setup_exit));
        button.setVisibility(0);
        button.setOnClickListener(new ovz(this));
        textView.setCompoundDrawablesWithIntrinsicBounds((int) C0126R.C0127drawable.car_ic_bluetooth_gms, 0, 0, 0);
        ((TextView) inflate.findViewById(C0126R.C0129id.title)).setText(activity.getString(C0126R.string.car_setup_authorizing_car_connection_title));
        textView.setText(getString(C0126R.string.car_setup_authorizing_car_connection_message_1));
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        textView2.setText(Html.fromHtml(getString(C0126R.string.car_setup_authorizing_car_connection_message_2, owl.m29904a(activity, "topic/6106806"))), TextView.BufferType.SPANNABLE);
        textView2.setCompoundDrawablesWithIntrinsicBounds((int) C0126R.C0127drawable.car_ic_notifications_gms, 0, 0, 0);
        return inflate;
    }
}
