package com.google.android.places.p095ui.aliaseditor;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.internal.PlaceEntity;
import com.google.android.gms.maps.model.LatLng;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.places.ui.aliaseditor.AliasEditorChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AliasEditorChimeraActivity extends deu implements bijv, biis, bike, biic, biid, biia {

    /* renamed from: b */
    public biij f151374b;

    /* renamed from: c */
    public String f151375c;

    /* renamed from: d */
    public AlertDialog f151376d;

    /* renamed from: e */
    public bijx f151377e;

    /* renamed from: f */
    public boolean f151378f;

    /* renamed from: g */
    public boolean f151379g;

    /* renamed from: h */
    public aelh f151380h;

    /* renamed from: i */
    public aelh f151381i;

    /* renamed from: j */
    private bijw f151382j;

    /* renamed from: k */
    private ProgressDialog f151383k;

    /* renamed from: l */
    private AlertDialog f151384l;

    /* renamed from: m */
    private int f151385m;

    /* renamed from: n */
    private int f151386n;

    /* renamed from: o */
    private int f151387o;

    /* renamed from: p */
    private Bitmap f151388p;

    /* renamed from: q */
    private int f151389q;

    /* renamed from: r */
    private int f151390r;

    /* renamed from: s */
    private int f151391s;

    /* renamed from: t */
    private biis f151392t;

    /* renamed from: u */
    private biir f151393u;

    /* renamed from: a */
    private final void m117738a(int i) {
        String string = getString(i);
        if (this.f151383k == null) {
            ProgressDialog progressDialog = new ProgressDialog(this);
            this.f151383k = progressDialog;
            progressDialog.setCancelable(false);
            this.f151383k.setIndeterminate(true);
        }
        this.f151383k.setMessage(string);
        this.f151383k.show();
    }

    /* renamed from: a */
    private final void m117741a(bikf bikf) {
        bikf.f120769a = this;
        bikf.f120770b = this.f151374b;
    }

    /* renamed from: b */
    private final void m117743b(String str) {
        if (Log.isLoggable("Places", 6)) {
            Log.e("Places", str);
        }
        setResult(2);
        finish();
    }

    /* renamed from: c */
    private final void m117744c(String str, String str2) {
        Intent intent = new Intent();
        intent.putExtra("edited_alias_name", this.f151375c);
        intent.putExtra("edited_alias_address", str2);
        intent.putExtra("edited_alias_place_id", str);
        setResult(-1, intent);
        finish();
    }

    /* renamed from: d */
    public final void mo64645d() {
        runOnUiThread(new bijg(this));
    }

    /* renamed from: e */
    public final void mo64686e() {
        int i = this.f151385m;
        int i2 = this.f151386n;
        aelh aelh = this.f151380h;
        String str = null;
        if (!(aelh == null || aelh.mo8025r() == null)) {
            str = this.f151380h.mo8025r().toString();
        }
        biiv a = biiv.m102449a(i, i2, str);
        m117739a(a, this);
        getSupportFragmentManager().beginTransaction().replace(C0126R.C0129id.content_area, a, "search_fragment").addToBackStack("search_transaction").commit();
    }

    /* renamed from: g */
    public final void mo64687g() {
        aelh aelh = this.f151380h;
        String a = spn.m35852a((Activity) this);
        int i = this.f151389q;
        int i2 = this.f151390r;
        int i3 = this.f151391s;
        int i4 = this.f151385m;
        int i5 = this.f151386n;
        int i6 = this.f151387o;
        Bundle bundle = new Bundle();
        bundle.putParcelable("selected_place", (PlaceEntity) aelh);
        bundle.putString("calling_package", a);
        bundle.putInt("overlay_resource_id", i);
        bundle.putInt("overlay_width", i2);
        bundle.putInt("overlay_height", i3);
        bundle.putInt("primary_color", i4);
        bundle.putInt("primary_color_dark", i5);
        bundle.putInt("text_color", i6);
        bikf bikf = new bikf();
        bikf.setArguments(bundle);
        m117741a(bikf);
        this.f151392t = bikf;
        this.f151393u = bikf;
        getSupportFragmentManager().beginTransaction().replace(C0126R.C0129id.content_area, bikf, "map_fragment").addToBackStack("map_transaction").commit();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.Object, java.lang.Object):void */
    /* renamed from: h */
    public final void mo64688h() {
        m117738a((int) C0126R.string.alias_editor_deleting_alias);
        biij biij = this.f151374b;
        String str = this.f151375c;
        rke rke = biij.f120666m;
        if (rke != null) {
            rke.mo9460b();
        }
        rjo rjo = aema.f63501a;
        rkb rkb = biij.f120654a;
        sdo.m34966a((Object) str, (Object) "alias == null");
        if (!str.equals("Home") && !str.equals("Work")) {
            sdo.m34975b(false, "subId == null when alias is not home or work");
        }
        biij.f120666m = rkb.mo24795b(new aenb(aema.f63501a, rkb, str));
        biij.f120666m.mo9459a(new bihz(biij), cggj.m145237d(), TimeUnit.MILLISECONDS);
    }

    /* renamed from: i */
    public final void mo64698i() {
        onBackPressed();
    }

    /* renamed from: j */
    public final void mo64699j() {
        int i = this.f151385m;
        int i2 = this.f151386n;
        aelh aelh = this.f151380h;
        String str = null;
        if (!(aelh == null || aelh.mo8025r() == null)) {
            str = this.f151380h.mo8025r().toString();
        }
        biiv a = biiv.m102449a(i, i2, str);
        m117740a(a, this.f151392t, this.f151393u);
        getSupportFragmentManager().beginTransaction().replace(C0126R.C0129id.content_area, a, "map_search_fragment").addToBackStack("map_search_transaction").commit();
    }

    /* renamed from: k */
    public final void mo71309k() {
        ProgressDialog progressDialog = this.f151383k;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }

    /* renamed from: l */
    public final void mo71310l() {
        getSupportFragmentManager().popBackStackImmediate();
        aelh aelh = this.f151380h;
        if (aelh != null) {
            mo71307b(aelh);
        }
    }

    public final void onBackPressed() {
        if (getSupportFragmentManager().getBackStackEntryCount() <= 0) {
            aelh aelh = this.f151380h;
            if (aelh != null) {
                m117744c(aelh.mo8007a(), this.f151380h.mo8025r().toString());
            } else {
                m117744c(null, null);
            }
        } else {
            mo71310l();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        ComponentName b = spn.m35865b((Activity) this);
        if (b == null) {
            m117743b("Cannot find caller. Did you forget to use startActivityForResult?");
        } else if (b.getPackageName() == null) {
            m117743b("Cannot find caller's package name.");
        } else {
            this.f151377e = new bijx(this, getIntent(), b);
            try {
                bidx bidx = new bidx(1);
                bidx.mo64560a(this, this.f151377e.f120751a);
                bijx bijx = this.f151377e;
                bidx.mo64561a(bijx.f120751a, bijx.f120754d);
                bijx bijx2 = this.f151377e;
                if (bijx2.f120753c == null) {
                    m117743b("Cannot find user's account name.");
                    return;
                }
                String str = bijx2.f120752b;
                if (str == null) {
                    m117743b("Cannot find alias name to be edited.");
                    return;
                }
                this.f151375c = str;
                if (str.equals("Home") || this.f151375c.equals("Work")) {
                    bijx bijx3 = this.f151377e;
                    this.f151374b = new biij(this, bijx3.f120751a, bijx3.f120753c, new PlaceFilter(), this.f151377e.f120754d);
                    int i2 = this.f151377e.f120758h;
                    this.f151389q = i2;
                    if (i2 > 0) {
                        try {
                            this.f151388p = BitmapFactory.decodeResource(getPackageManager().getResourcesForApplication(b.getPackageName()), this.f151389q);
                            bijx bijx4 = this.f151377e;
                            this.f151390r = bijx4.f120759i;
                            this.f151391s = bijx4.f120760j;
                        } catch (PackageManager.NameNotFoundException e) {
                            if (Log.isLoggable("Places", 5)) {
                                Log.w("Places", String.format("Resources not found for %s, so map overlay is being ignored.", b.getPackageName()));
                            }
                        }
                    }
                    setContentView((int) C0126R.C0128layout.alias_editor_activity);
                    if (bundle == null) {
                        bijx bijx5 = this.f151377e;
                        int i3 = bijx5.f120755e;
                        if (i3 == 0 && bijx5.f120756f == 0) {
                            bigz bigz = new bigz(b, getPackageManager());
                            int color = getResources().getColor(C0126R.color.places_ui_default_primary);
                            try {
                                color = bigz.mo64606a("primary");
                            } catch (bigy e2) {
                            }
                            this.f151385m = color;
                            int color2 = getResources().getColor(C0126R.color.places_ui_default_primary_dark);
                            try {
                                color2 = bigz.mo64606a("primary_dark");
                            } catch (bigy e3) {
                            }
                            this.f151386n = color2;
                            i = biha.m102383a(this.f151385m, getResources().getColor(C0126R.color.text_white_alpha_87), getResources().getColor(C0126R.color.text_black_alpha_87));
                            this.f151387o = i;
                        } else {
                            if (i3 == 0) {
                                i3 = getResources().getColor(C0126R.color.places_ui_default_primary);
                            }
                            this.f151385m = i3;
                            int i4 = this.f151377e.f120756f;
                            if (i4 == 0) {
                                i4 = getResources().getColor(C0126R.color.places_ui_search_primary_dark);
                            }
                            this.f151386n = i4;
                            i = this.f151377e.f120757g;
                            if (i == 0) {
                                i = getResources().getColor(C0126R.color.places_ui_default_text);
                            }
                            this.f151387o = i;
                        }
                        String str2 = this.f151377e.f120752b;
                        int i5 = this.f151385m;
                        int i6 = this.f151386n;
                        bijw bijw = new bijw();
                        Bundle bundle2 = new Bundle();
                        bundle2.putCharSequence("alias_name", str2);
                        bundle2.putInt("primary_color", i5);
                        bundle2.putInt("primary_color_dark", i6);
                        bundle2.putInt("text_color", i);
                        bijw.setArguments(bundle2);
                        this.f151382j = bijw;
                        getSupportFragmentManager().beginTransaction().add(C0126R.C0129id.content_area, this.f151382j, "editor_fragment").commit();
                    } else {
                        this.f151385m = bundle.getInt("primary_color");
                        this.f151386n = bundle.getInt("primary_color_dark");
                        this.f151387o = bundle.getInt("text_color");
                        this.f151380h = PlaceEntity.m66940a(bundle.getParcelable("aliased_place"), this);
                        this.f151381i = PlaceEntity.m66940a(bundle.getParcelable("pending_aliased_place"), this);
                        this.f151382j = (bijw) getSupportFragmentManager().findFragmentByTag("editor_fragment");
                        biiv biiv = (biiv) getSupportFragmentManager().findFragmentByTag("search_fragment");
                        if (biiv != null) {
                            m117739a(biiv, this);
                        }
                        bikf bikf = (bikf) getSupportFragmentManager().findFragmentByTag("map_fragment");
                        if (bikf != null) {
                            this.f151392t = bikf;
                            this.f151393u = bikf;
                            m117741a(bikf);
                        }
                        biiv biiv2 = (biiv) getSupportFragmentManager().findFragmentByTag("map_search_fragment");
                        if (biiv2 != null) {
                            biis biis = this.f151392t;
                            biir biir = this.f151393u;
                            if (biir == null) {
                                biir = new bijd();
                            }
                            m117740a(biiv2, biis, biir);
                        }
                    }
                    if (this.f151380h == null) {
                        this.f151378f = false;
                        m117738a((int) C0126R.string.alias_editor_loading_alias);
                        this.f151374b.mo64649b();
                        return;
                    }
                    this.f151378f = true;
                    return;
                }
                m117743b(String.format("The AliasEditor supports only %s and %s.", "Home", "Work"));
            } catch (aaaj e4) {
                m117743b(e4.getMessage());
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        mo71309k();
        AlertDialog alertDialog = this.f151376d;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        AlertDialog alertDialog2 = this.f151384l;
        if (alertDialog2 != null) {
            alertDialog2.dismiss();
        }
        super.onDestroy();
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("primary_color", this.f151385m);
        bundle.putInt("primary_color_dark", this.f151386n);
        bundle.putInt("text_color", this.f151387o);
        bundle.putParcelable("aliased_place", (PlaceEntity) this.f151380h);
        bundle.putParcelable("pending_aliased_place", (PlaceEntity) this.f151381i);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        this.f151382j.f120744a = this;
        biij biij = this.f151374b;
        biij.f120659f = this;
        biij.f120660g = this;
        biij.f120654a.mo24790a((rjz) new bihu(new bije(this)));
        biij.f120654a.mo24801e();
        this.f151379g = true;
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        this.f151379g = false;
        this.f151374b.f120654a.mo24803g();
        biij biij = this.f151374b;
        biij.f120660g = null;
        biij.f120659f = null;
        this.f151382j.f120744a = null;
        super.onStop();
    }

    /* renamed from: c */
    public final void mo64643c() {
        this.f151380h = null;
        bijw bijw = this.f151382j;
        if (bijw != null) {
            bijw.f120745b.setText(bijw.getString(C0126R.string.alias_editor_default_address_format, bijw.f120748e));
            bijw.f120746c.mo43844a(new bijt(bijw));
        }
        mo71309k();
    }

    /* renamed from: b */
    public final void mo64642b() {
        mo71309k();
        if (this.f151384l == null) {
            this.f151384l = new AlertDialog.Builder(this).setMessage((int) C0126R.string.alias_editor_delete_failed).setPositiveButton((int) C0126R.string.common_retry, new bijl(this)).setNegativeButton((int) C0126R.string.common_cancel, new bijk(this)).setOnCancelListener(new bijj(this)).create();
        }
        this.f151384l.show();
    }

    /* renamed from: a */
    private final void m117739a(biiv biiv, biis biis) {
        m117740a(biiv, biis, new bijc());
    }

    /* renamed from: a */
    private final void m117740a(biiv biiv, biis biis, biir biir) {
        biiv.f120689e = biis;
        biiv.f120691g = this.f151374b;
        biiv.f120690f = bihb.m102385a(this);
        biiv.f120693i = 6;
        biiv.f120692h = biir;
    }

    /* renamed from: a */
    public final void mo64638a() {
        runOnUiThread(new biji(this));
    }

    /* renamed from: a */
    public final void mo64697a(aelh aelh) {
        if (aelh != null) {
            this.f151381i = aelh;
            mo71308b(aelh.mo8007a(), this.f151381i.mo8025r().toString());
        }
    }

    /* renamed from: a */
    public final void mo64640a(String str) {
        if (str != null) {
            biij biij = this.f151374b;
            biij.f120661h = this;
            biij.mo64648a(new String[]{str});
            return;
        }
        this.f151374b.mo64649b();
    }

    /* renamed from: b */
    public final void mo71307b(aelh aelh) {
        String str;
        sdo.m34967a("updateAlias must be called on the UI thread");
        if (this.f151379g && this.f151382j.f120747d) {
            if (aelh.mo8025r() == null || aelh.mo8025r().equals("")) {
                str = aelh.mo8010d().toString();
            } else {
                str = aelh.mo8025r();
            }
            if (this.f151388p != null) {
                bijw bijw = this.f151382j;
                LatLng d = aelh.mo8010d();
                Bitmap bitmap = this.f151388p;
                float f = (float) this.f151390r;
                float f2 = (float) this.f151391s;
                bijw.f120746c.mo43844a(new bijr(bijw, aepo.m52351a(d, (double) Math.max(f, f2)), d, str, bitmap, f, f2));
            } else if (aelh.mo8013g() != null) {
                bijw bijw2 = this.f151382j;
                LatLng d2 = aelh.mo8010d();
                bijw2.f120746c.mo43844a(new bijs(bijw2, aelh.mo8013g(), d2, str));
            } else {
                bijw bijw3 = this.f151382j;
                bijw3.f120746c.mo43844a(new bijq(bijw3, aelh.mo8010d(), str));
            }
        }
    }

    /* renamed from: a */
    public final void mo64641a(String str, String str2) {
        runOnUiThread(new bijb(this, this, str, str2));
    }

    /* renamed from: a */
    public final void mo64644a(Map map) {
        runOnUiThread(new bijf(this, map));
    }

    /* renamed from: a */
    public final void mo64639a(aelh[] aelhArr) {
        runOnUiThread(new bijh(this, aelhArr));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.Object, java.lang.Object):void */
    /* renamed from: b */
    public final void mo71308b(String str, String str2) {
        m117738a((int) C0126R.string.alias_editor_saving_alias);
        biij biij = this.f151374b;
        String str3 = this.f151375c;
        rke rke = biij.f120665l;
        if (rke != null) {
            rke.mo9460b();
        }
        rjo rjo = aema.f63501a;
        rkb rkb = biij.f120654a;
        boolean z = true;
        if (str == null && str2 == null) {
            z = false;
        }
        sdo.m34975b(z, "placeId == null and address == null");
        sdo.m34966a((Object) str3, (Object) "alias == null");
        biij.f120665l = rkb.mo24795b(new aena(aema.f63501a, rkb, str3, str, str2));
        biij.f120665l.mo9459a(new biii(biij, str, str2), cggj.m145237d(), TimeUnit.MILLISECONDS);
    }

    /* renamed from: b */
    public final void mo64656b(aelh[] aelhArr) {
        aelh aelh = aelhArr[0];
        if (aelh != null) {
            this.f151381i = aelh;
            mo71308b(aelh.mo8007a(), this.f151381i.mo8025r().toString());
        }
    }
}
