package p000;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.places.p095ui.TouchableMapView;

/* renamed from: bijw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bijw extends Fragment {

    /* renamed from: a */
    public bijv f120744a;

    /* renamed from: b */
    public TextView f120745b;

    /* renamed from: c */
    public MapView f120746c;

    /* renamed from: d */
    public boolean f120747d;

    /* renamed from: e */
    public String f120748e;

    /* renamed from: f */
    private MenuItem f120749f;

    /* renamed from: g */
    private AlertDialog f120750g;

    /* renamed from: a */
    public final void mo64689a(afcn afcn) {
        Location lastKnownLocation;
        LocationManager locationManager = (LocationManager) getActivity().getSystemService("location");
        if (locationManager != null && (lastKnownLocation = locationManager.getLastKnownLocation("passive")) != null) {
            afcn.mo34749a(afci.m52839a(new LatLng(lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude())));
        } else if (this.f120746c.getWidth() > 0) {
            afcn.mo34749a(afci.m52840a(new LatLngBounds(new LatLng(-90.0d, -180.0d), new LatLng(90.0d, 180.0d)), this.f120746c.getWidth(), this.f120746c.getHeight()));
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        bigz.m102378a(getActivity(), getArguments().getInt("primary_color"), getArguments().getInt("primary_color_dark"), getArguments().getInt("text_color"));
    }

    public final void onCreate(Bundle bundle) {
        setRetainInstance(true);
        super.onCreate(bundle);
    }

    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(C0126R.C0130menu.alias_editor_menu_map, menu);
        MenuItem findItem = menu.findItem(C0126R.C0129id.alias_editor_menu_delete);
        this.f120749f = findItem;
        if (findItem != null) {
            Activity activity = getActivity();
            MenuItem menuItem = this.f120749f;
            int i = getArguments().getInt("text_color");
            if (bigz.m102376a(activity) != null) {
                Drawable drawable = activity.getResources().getDrawable(C0126R.C0127drawable.ic_delete);
                bigz.m102377a(drawable, i);
                menuItem.setIcon(drawable);
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        CharSequence charSequence;
        setHasOptionsMenu(true);
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.alias_editor_fragment, viewGroup, false);
        this.f120745b = (TextView) inflate.findViewById(C0126R.C0129id.address_field);
        TouchableMapView touchableMapView = (TouchableMapView) inflate.findViewById(C0126R.C0129id.map);
        this.f120746c = touchableMapView;
        touchableMapView.mo43844a(new bijo(this));
        if (getArguments() != null) {
            CharSequence charSequence2 = getArguments().getCharSequence("alias_name");
            this.f120748e = charSequence2 == null ? "" : charSequence2.toString();
        }
        if (!(bundle == null || (charSequence = bundle.getCharSequence("alias_address")) == null)) {
            this.f120745b.setText(charSequence);
        }
        this.f120745b.setOnClickListener(new bijp(this));
        this.f120746c.mo43845a(bundle);
        C1341rz aW = ((deu) getActivity()).mo8628aW();
        if (aW != null) {
            aW.mo15860d(12);
        }
        if (this.f120748e.equals("Home")) {
            String string = getString(C0126R.string.alias_editor_home_display);
            this.f120748e = string;
            if (aW != null) {
                aW.mo15845a(getString(C0126R.string.alias_editor_label_format, string));
            }
            ((ImageView) inflate.findViewById(C0126R.C0129id.address_icon)).setImageDrawable(getActivity().getResources().getDrawable(C0126R.C0127drawable.ic_qu_home));
        } else if (this.f120748e.equals("Work")) {
            String string2 = getString(C0126R.string.alias_editor_work_display);
            this.f120748e = string2;
            if (aW != null) {
                aW.mo15845a(getString(C0126R.string.alias_editor_label_format, string2));
            }
            ((ImageView) inflate.findViewById(C0126R.C0129id.address_icon)).setImageDrawable(getActivity().getResources().getDrawable(C0126R.C0127drawable.ic_qu_work));
        } else {
            this.f120748e = getString(C0126R.string.alias_editor_alias_display);
        }
        this.f120745b.setText(getString(C0126R.string.alias_editor_default_address_format, this.f120748e));
        ((TextView) inflate.findViewById(C0126R.C0129id.disclaimer_text_view)).setText(getString(C0126R.string.alias_editor_disclaimer_format, this.f120748e));
        return inflate;
    }

    public final void onDestroy() {
        super.onDestroy();
        MapView mapView = this.f120746c;
        if (mapView != null) {
            mapView.mo43848c();
        }
    }

    public final void onLowMemory() {
        super.onLowMemory();
        this.f120746c.mo43849d();
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem != this.f120749f) {
            return super.onOptionsItemSelected(menuItem);
        }
        if (this.f120750g == null) {
            this.f120750g = new AlertDialog.Builder(getActivity()).setCancelable(true).setTitle(getString(C0126R.string.alias_editor_confirmation_title, this.f120748e)).setMessage(getString(C0126R.string.alias_editor_confirmation_message, this.f120748e)).setPositiveButton((int) C0126R.string.alias_editor_delete_alias, new biju(this)).setNegativeButton((int) C0126R.string.common_cancel, (DialogInterface.OnClickListener) null).create();
        }
        this.f120750g.show();
        return true;
    }

    public final void onPause() {
        super.onPause();
        this.f120746c.mo43846b();
    }

    public final void onResume() {
        this.f120746c.mo43843a();
        super.onResume();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        TextView textView = this.f120745b;
        if (textView != null) {
            bundle.putCharSequence("alias_address", textView.getText());
        }
        MapView mapView = this.f120746c;
        if (mapView != null) {
            mapView.mo43847b(bundle);
        }
        super.onSaveInstanceState(bundle);
    }

    public final void onStart() {
        super.onStart();
        this.f120747d = true;
    }

    public final void onStop() {
        super.onStop();
        this.f120747d = false;
    }

    /* renamed from: a */
    public final void mo64690a(CharSequence charSequence, LatLng latLng, Bitmap bitmap, float f, float f2, afch afch, afcn afcn) {
        TextView textView = this.f120745b;
        if (textView != null) {
            textView.setText(charSequence);
        }
        afcn.mo34755b();
        if (bitmap != null) {
            GroundOverlayOptions groundOverlayOptions = new GroundOverlayOptions();
            groundOverlayOptions.mo43862a(0.4f);
            groundOverlayOptions.mo43864a(latLng, f, f2);
            groundOverlayOptions.mo43863a(afgw.m53067a(bitmap));
            afcn.mo34746a(groundOverlayOptions);
        }
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.mo43878a(latLng);
        markerOptions.f79902d = afgw.m53066a();
        afcn.mo34747a(markerOptions);
        afcn.mo34749a(afch);
    }
}
