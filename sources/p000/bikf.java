package p000;

import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.location.places.internal.PlaceEntity;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: bikf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bikf extends Fragment implements bihr, biie, biis, biir {

    /* renamed from: a */
    public bike f120769a;

    /* renamed from: b */
    public biij f120770b;

    /* renamed from: c */
    public biht f120771c;

    /* renamed from: d */
    public boolean f120772d;

    /* renamed from: e */
    public boolean f120773e;

    /* renamed from: f */
    public boolean f120774f;

    /* renamed from: g */
    public aelh f120775g;

    /* renamed from: h */
    public CameraPosition f120776h;

    /* renamed from: i */
    public aelh f120777i;

    /* renamed from: j */
    private boolean f120778j;

    /* renamed from: k */
    private TextView f120779k;

    /* renamed from: l */
    private TextView f120780l;

    /* renamed from: m */
    private aelh[] f120781m;

    /* renamed from: n */
    private MenuItem f120782n;

    /* renamed from: o */
    private sfr f120783o;

    /* renamed from: e */
    private final void m102482e() {
        mo64700a((int) C0126R.string.alias_editor_updating_location);
        biht biht = this.f120771c;
        if (!biht.f120633u) {
            biht.f120633u = true;
            biht.getView().setVisibility(4);
            biht.mo64617a(false);
            biht.mo64618b(false);
            View view = biht.f120622j;
            if (view != null) {
                view.setVisibility(4);
            }
        }
        this.f120771c.mo64620c(true);
    }

    /* renamed from: a */
    public final void mo64611a() {
        if (this.f120773e) {
            this.f120773e = false;
            this.f120771c.mo64623f();
            Toast.makeText(getActivity(), (int) C0126R.string.places_ui_no_current_location_toast, 0).show();
        }
    }

    /* renamed from: b */
    public final void mo64613b() {
        if (this.f120773e) {
            this.f120773e = false;
            this.f120771c.mo64623f();
            Toast.makeText(getActivity(), (int) C0126R.string.places_ui_no_current_location_toast, 0).show();
            mo64702c();
        }
    }

    /* renamed from: c */
    public final void mo64702c() {
        this.f120775g = null;
        this.f120771c.mo64617a(true);
        if (this.f120771c.mo64619c() != null) {
            this.f120770b.mo64647a(this.f120771c.mo64619c());
        } else if (getView() != null) {
            biix.m102464a(getView(), new bikc(this));
        } else if (Log.isLoggable("Places", 5)) {
            Log.w("Places", "Alias Editor is skipping reverse geocode because it has no view.");
            return;
        } else {
            return;
        }
        bikd bikd = new bikd(this);
        this.f120774f = true;
        new adzt(Looper.getMainLooper()).postDelayed(bikd, (long) ((int) cggj.f186839a.mo6606a().mo83707g()));
    }

    /* renamed from: d */
    public final LatLngBounds mo64621d() {
        biht biht = this.f120771c;
        if (biht == null) {
            return new LatLngBounds(new LatLng(-90.0d, -180.0d), new LatLng(90.0d, 180.0d));
        }
        return biht.mo64621d();
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        bigz.m102378a(getActivity(), getArguments().getInt("primary_color"), getArguments().getInt("primary_color_dark"), getArguments().getInt("text_color"));
        if (bundle != null) {
            this.f120777i = PlaceEntity.m66940a(bundle.getParcelable("marked_place"), getActivity());
            Parcelable[] parcelableArray = bundle.getParcelableArray("places_on_map");
            if (parcelableArray != null) {
                this.f120781m = new aelh[parcelableArray.length];
                for (int i = 0; i < parcelableArray.length; i++) {
                    this.f120781m[i] = PlaceEntity.m66940a(parcelableArray[i], getActivity());
                }
            }
        }
        biix.m102464a(getView(), new bika(this));
        String a = spn.m35852a(getActivity());
        ClientContext clientContext = new ClientContext();
        clientContext.f30215e = a;
        try {
            clientContext.f30212b = svr.m36484b(getActivity()).mo26172a(a, 0).uid;
            this.f120783o = sfr.m35174a(getActivity(), clientContext);
        } catch (PackageManager.NameNotFoundException e) {
            if (Log.isLoggable("Places", 6)) {
                String valueOf = String.valueOf(a);
                Log.e("Places", valueOf.length() == 0 ? new String("Failed to get app info for caller: ") : "Failed to get app info for caller: ".concat(valueOf));
            }
            getActivity().setResult(2);
            getActivity().finish();
        }
    }

    public final void onCreate(Bundle bundle) {
        setRetainInstance(true);
        super.onCreate(bundle);
    }

    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(C0126R.C0130menu.alias_editor_pick_a_place_menu_map, menu);
        MenuItem findItem = menu.findItem(C0126R.C0129id.alias_editor_menu_search);
        this.f120782n = findItem;
        if (findItem != null) {
            Activity activity = getActivity();
            MenuItem menuItem = this.f120782n;
            int i = getArguments().getInt("text_color");
            if (bigz.m102376a(activity) != null) {
                Drawable drawable = activity.getResources().getDrawable(C0126R.C0127drawable.ic_search);
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
        setHasOptionsMenu(true);
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.alias_editor_pick_a_place_fragment, viewGroup, false);
        biht biht = (biht) getChildFragmentManager().findFragmentByTag("marker_map_tag");
        this.f120771c = biht;
        if (biht == null) {
            this.f120771c = new biht();
            getChildFragmentManager().beginTransaction().add(C0126R.C0129id.map_fragment_frame, this.f120771c, "marker_map_tag").commit();
        }
        this.f120771c.f120616d = bihb.m102385a(getActivity());
        this.f120771c.f120632t = this;
        this.f120778j = true;
        this.f120779k = (TextView) inflate.findViewById(C0126R.C0129id.address_view);
        inflate.findViewById(C0126R.C0129id.cancel_button).setOnClickListener(new bijy(this));
        TextView textView = (TextView) inflate.findViewById(C0126R.C0129id.update_button);
        this.f120780l = textView;
        textView.setOnClickListener(new bijz(this));
        this.f120780l.setClickable(false);
        if (bundle == null) {
            this.f120775g = PlaceEntity.m66940a(getArguments().getParcelable("selected_place"), getActivity());
        } else {
            this.f120775g = PlaceEntity.m66940a(bundle.getParcelable("selected_place"), getActivity());
            this.f120776h = (CameraPosition) bundle.getParcelable("map_camera_position");
        }
        ((deu) getActivity()).mo8628aW().mo15860d(12);
        return inflate;
    }

    public final void onDestroyView() {
        if (this.f120771c != null) {
            getChildFragmentManager().beginTransaction().remove(this.f120771c).commitAllowingStateLoss();
        }
        super.onDestroyView();
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != C0126R.C0129id.alias_editor_menu_search) {
            return super.onOptionsItemSelected(menuItem);
        }
        bike bike = this.f120769a;
        if (bike == null) {
            return true;
        }
        bike.mo64699j();
        return true;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        biht biht = this.f120771c;
        if (biht != null) {
            bundle.putParcelable("map_camera_position", biht.mo64622e());
        }
        aelh aelh = this.f120775g;
        if (aelh != null) {
            bundle.putParcelable("selected_place", (PlaceEntity) aelh);
        }
        aelh aelh2 = this.f120777i;
        if (aelh2 != null) {
            bundle.putParcelable("marked_place", (PlaceEntity) aelh2);
        }
        aelh[] aelhArr = this.f120781m;
        if (aelhArr != null) {
            Parcelable[] parcelableArr = new Parcelable[aelhArr.length];
            int i = 0;
            while (true) {
                aelh[] aelhArr2 = this.f120781m;
                if (i < aelhArr2.length) {
                    parcelableArr[i] = (PlaceEntity) aelhArr2[i];
                    i++;
                } else {
                    bundle.putParcelableArray("places_on_map", parcelableArr);
                    return;
                }
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sfr.a(java.lang.String, boolean):int
     arg types: [java.lang.String, int]
     candidates:
      sfr.a(android.content.Context, com.google.android.gms.common.internal.ClientContext):sfr
      sfr.a(java.lang.String, boolean):int */
    public final void onStart() {
        int i;
        boolean z;
        super.onStart();
        if (this.f120783o != null) {
            if (cghe.m145416b()) {
                i = this.f120783o.mo25482a("android.permission.ACCESS_FINE_LOCATION", false);
            } else {
                i = this.f120783o.mo25481a("android.permission.ACCESS_FINE_LOCATION");
            }
            biht biht = this.f120771c;
            if (i == -1 || i == -2) {
                z = false;
            } else {
                z = true;
            }
            if (biht.f120634v != z) {
                biht.f120634v = z;
                biht.f120617e.mo43844a(new bihj(biht));
                if (biht.f120634v) {
                    biht.f120622j = biht.getView().findViewById(C0126R.C0129id.marker_map_my_location_button);
                    biht.mo64625h();
                    biht.f120622j.setVisibility(0);
                } else {
                    View view = biht.f120622j;
                    if (view != null) {
                        view.setVisibility(8);
                        biht.f120622j = null;
                    }
                }
            }
            this.f120770b.f120658e = this;
            if (this.f120775g != null) {
                if (this.f120778j) {
                    this.f120778j = false;
                    String string = getArguments().getString("calling_package");
                    int i2 = getArguments().getInt("overlay_resource_id");
                    if (!(string == null || i2 == 0)) {
                        int i3 = getArguments().getInt("overlay_width");
                        int i4 = getArguments().getInt("overlay_height");
                        biht biht2 = this.f120771c;
                        if (i2 > 0 && i3 > 0 && i4 > 0) {
                            try {
                                Resources resourcesForApplication = biht2.getActivity().getPackageManager().getResourcesForApplication(string);
                                biht2.f120628p = afgw.m53067a(BitmapFactory.decodeResource(resourcesForApplication, i2));
                                biht2.f120629q = resourcesForApplication.getDrawable(i2);
                                biht2.f120630r = i3;
                                biht2.f120631s = i4;
                                biht2.f120621i.setImageDrawable(biht2.f120629q);
                                biht2.f120621i.setVisibility(0);
                            } catch (PackageManager.NameNotFoundException e) {
                                biht2.f120629q = null;
                                biht2.f120628p = null;
                                biht2.f120621i.setVisibility(8);
                                if (Log.isLoggable("Places", 6)) {
                                    StringBuilder sb = new StringBuilder(string.length() + 91);
                                    sb.append("Could not find reference marker overlay resource for package: ");
                                    sb.append(string);
                                    sb.append(", and resourceId: ");
                                    sb.append(i2);
                                    bioi.m102658a("Places", sb.toString());
                                }
                            }
                        } else {
                            if (Log.isLoggable("Places", 6) && i2 > 0) {
                                bioi.m102658a("Places", "Invalid width or height for reference marker overlay");
                            }
                            biht2.f120629q = null;
                            biht2.f120628p = null;
                            biht2.f120621i.setVisibility(8);
                        }
                    }
                }
                if (!this.f120773e) {
                    CameraPosition cameraPosition = this.f120776h;
                    if (cameraPosition != null) {
                        biht biht3 = this.f120771c;
                        biht3.f120617e.mo43844a(new biho(biht3, cameraPosition));
                    } else {
                        this.f120771c.mo64616a(this.f120775g.mo8010d());
                    }
                    if (this.f120781m != null) {
                        biht biht4 = this.f120771c;
                        biht4.f120617e.mo43844a(new bihc(biht4));
                        biht biht5 = this.f120771c;
                        aelh[] aelhArr = this.f120781m;
                        if (aelhArr != null) {
                            biht5.f120617e.mo43844a(new bihd(biht5, aelhArr));
                        }
                        this.f120771c.mo64617a(false);
                    }
                    aelh aelh = this.f120777i;
                    if (aelh != null) {
                        this.f120771c.mo64615a(aelh);
                        this.f120771c.mo64617a(false);
                        mo64701a(this.f120777i);
                        return;
                    }
                    this.f120771c.mo64617a(true);
                    mo64701a(this.f120775g);
                    return;
                }
                m102482e();
                return;
            }
            this.f120773e = true;
            m102482e();
        }
    }

    public final void onStop() {
        this.f120770b.mo64646a();
        this.f120770b.f120658e = null;
        super.onStop();
    }

    /* renamed from: a */
    public final void mo64700a(int i) {
        this.f120779k.setText(i);
    }

    /* renamed from: b */
    public final void mo64656b(aelh[] aelhArr) {
        aelh aelh = aelhArr[0];
        if (aelh != null) {
            this.f120781m = aelhArr;
            this.f120777i = aelh;
            this.f120776h = new CameraPosition(aelh.mo8010d(), 17.0f, 0.0f, 0.0f);
            getActivity().onBackPressed();
        }
    }

    /* renamed from: a */
    public final void mo64701a(aelh aelh) {
        String str;
        sdo.m34967a("setCurrentAddress must be called on the UI thread!");
        this.f120775g = aelh;
        if (aelh != null) {
            this.f120780l.setClickable(true);
            this.f120780l.setTextColor(getActivity().getResources().getColor(C0126R.color.alias_editor_button_enabled));
        } else {
            this.f120780l.setClickable(false);
            this.f120780l.setTextColor(getActivity().getResources().getColor(C0126R.color.alias_editor_button_disabled));
        }
        if (aelh != null && !TextUtils.isEmpty(aelh.mo8025r())) {
            str = aelh.mo8025r().toString();
        } else if (aelh != null && !TextUtils.isEmpty(aelh.mo8024q())) {
            str = aelh.mo8024q().toString();
        } else {
            str = getString(C0126R.string.common_unknown);
        }
        this.f120779k.setText(str);
    }

    /* renamed from: a */
    public final void mo64612a(LatLng latLng) {
        this.f120771c.mo64623f();
        if (this.f120773e) {
            this.f120773e = false;
            this.f120771c.mo64623f();
            this.f120771c.mo64616a(latLng);
            return;
        }
        biht biht = this.f120771c;
        biht.f120617e.mo43844a(new bihq(biht, latLng));
    }
}
