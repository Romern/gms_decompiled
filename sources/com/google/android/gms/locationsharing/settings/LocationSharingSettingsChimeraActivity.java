package com.google.android.gms.locationsharing.settings;

import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.support.p002v7.widget.RecyclerView;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.locationsharing.common.model.LocationShare;
import com.google.android.gms.locationsharing.common.model.LocationSharingSettings;
import com.google.android.gms.locationsharing.common.model.ShareTarget;
import com.google.android.gms.locationsharing.common.model.SharingCondition;
import com.google.android.libraries.material.progress.LinearProgressBar;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LocationSharingSettingsChimeraActivity extends deu implements AdapterView.OnItemSelectedListener, aess, aeux, aevl {

    /* renamed from: j */
    public static final /* synthetic */ int f79707j = 0;

    /* renamed from: b */
    public aevn f79708b;

    /* renamed from: c */
    public String f79709c;

    /* renamed from: d */
    public aetk f79710d;

    /* renamed from: e */
    public aest f79711e;

    /* renamed from: f */
    public aesz f79712f;

    /* renamed from: g */
    public boolean f79713g;

    /* renamed from: h */
    public boolean f79714h;

    /* renamed from: i */
    TestableBroadcastReceiver f79715i;

    /* renamed from: k */
    private RecyclerView f79716k;

    /* renamed from: l */
    private suo f79717l;

    /* renamed from: m */
    private LocationSharingSettings f79718m;

    /* renamed from: n */
    private LoaderManager.LoaderCallbacks f79719n;

    /* renamed from: o */
    private int f79720o;

    /* renamed from: p */
    private final View.OnClickListener f79721p = new aeuz(this);

    /* renamed from: q */
    private rjx f79722q;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public abstract class TestableBroadcastReceiver extends aacn {
        public TestableBroadcastReceiver() {
            super("locationsharing");
        }
    }

    static {
        sgj sgj = sgj.UNKNOWN;
    }

    /* renamed from: b */
    private final void m67060b(LocationSharingSettings locationSharingSettings) {
        if (locationSharingSettings.f79631a.booleanValue() || locationSharingSettings.f79634d.booleanValue()) {
            m67061c(locationSharingSettings);
            return;
        }
        findViewById(C0126R.C0129id.settings_fragment_container).setVisibility(8);
        findViewById(C0126R.C0129id.error_view).setVisibility(0);
        View findViewById = findViewById(C0126R.C0129id.error_view);
        findViewById.findViewById(C0126R.C0129id.try_again).setVisibility(8);
        TextView textView = (TextView) findViewById.findViewById(C0126R.C0129id.empty_text);
        textView.setText(Html.fromHtml(getString(C0126R.string.location_sharing_dogfood_alert, cfaz.f183554a.mo6606a().mo80778a())));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        this.f79710d.mo34553b(14);
    }

    /* renamed from: c */
    private final void m67061c(LocationSharingSettings locationSharingSettings) {
        if (!this.f79714h) {
            this.f79714h = true;
            findViewById(C0126R.C0129id.settings_fragment_container).setVisibility(0);
            aevn aevn = new aevn(this, locationSharingSettings, this, this);
            this.f79708b = aevn;
            this.f79716k.swapAdapter(aevn, true);
            if (this.f79712f.mo34534a()) {
                mo43808b(true);
                aesz aesz = this.f79712f;
                LoaderManager.LoaderCallbacks loaderCallbacks = this.f79719n;
                for (Integer num : aesz.f63757b) {
                    int intValue = num.intValue();
                    aesz.f63758c.initLoader(intValue, null, aesz.mo34531a(intValue, loaderCallbacks));
                }
            }
        } else if (this.f79718m == null) {
            this.f79708b.mo34611b(true);
            HashSet hashSet = new HashSet(locationSharingSettings.mo43766a());
            ArrayList arrayList = new ArrayList(mo43809e().mo43766a());
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                LocationShare locationShare = (LocationShare) arrayList.get(i);
                if (!hashSet.contains(locationShare) && locationShare.mo43762h() == 2) {
                    this.f79708b.mo34607a(locationShare);
                } else if (hashSet.contains(locationShare) && locationShare.mo43762h() != 2) {
                    hashSet.remove(locationShare);
                }
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                this.f79708b.mo34609b((LocationShare) it.next());
            }
        }
    }

    /* renamed from: g */
    private final void m67062g() {
        LocationSharingSettings a = aexo.m52652a(this, this.f79709c);
        LocationSharingSettings locationSharingSettings = this.f79718m;
        if (locationSharingSettings != null) {
            m67060b(locationSharingSettings);
        } else if (a != null && a.f79631a.booleanValue() && !a.mo43766a().isEmpty()) {
            m67061c(a);
        }
        this.f79711e.mo34520a(this.f79709c, this.f79718m);
    }

    /* renamed from: a */
    public final void mo34513a() {
        if (!this.f79714h) {
            findViewById(C0126R.C0129id.location_settings_content).setVisibility(8);
            findViewById(C0126R.C0129id.empty_settings_view).setVisibility(8);
            findViewById(C0126R.C0129id.settings_fragment_container).setVisibility(8);
            findViewById(C0126R.C0129id.error_view).setVisibility(8);
            aexw.m52664a(this, C0126R.string.location_sharing_loading_settings, true);
            return;
        }
        mo43806a(true, false);
        this.f79708b.mo34611b(false);
    }

    /* renamed from: aX */
    public final boolean mo8629aX() {
        finish();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final LocationSharingSettings mo43809e() {
        aevn aevn = this.f79708b;
        if (aevn != null) {
            return aevn.f63903a;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        int indexOf;
        cajl a;
        if (i2 == -1) {
            if (i != 4) {
                mo43809e().mo43769d();
                ArrayList b = sef.m35076b(intent, "target_location_shares", LocationShare.CREATOR);
                boolean booleanExtra = intent.getBooleanExtra("is_finished", false);
                if (!booleanExtra) {
                    mo43806a(true, true);
                }
                int size = b.size();
                for (int i3 = 0; i3 < size; i3++) {
                    LocationShare locationShare = (LocationShare) b.get(i3);
                    if (!aexk.m52648c(locationShare.mo43755b()) && !aexk.m52649d(locationShare.mo43755b())) {
                        if (i == 3 && (indexOf = this.f79708b.f63903a.mo43766a().indexOf(locationShare)) != -1) {
                            aetk aetk = this.f79710d;
                            SharingCondition sharingCondition = locationShare.f79628b;
                            bxvd da = cajf.f174814d.mo74144da();
                            if (!(sharingCondition == null || (a = aetk.m52536a(sharingCondition)) == null)) {
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                cajf cajf = (cajf) da.f164949b;
                                a.getClass();
                                cajf.f174817b = a;
                                cajf.f174816a |= 1;
                            }
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            cajf cajf2 = (cajf) da.f164949b;
                            cajf2.f174816a |= 4;
                            cajf2.f174818c = indexOf;
                            bxvd d = aetk.m52539d(8);
                            if (d.f164950c) {
                                d.mo74035c();
                                d.f164950c = false;
                            }
                            caix caix = (caix) d.f164949b;
                            cajf cajf3 = (cajf) da.mo74062i();
                            caix caix2 = caix.f174776l;
                            cajf3.getClass();
                            caix.f174782e = cajf3;
                            caix.f174778a |= 64;
                            aetk.mo34552a((caix) d.mo74062i());
                        }
                        this.f79708b.mo34608a(locationShare, booleanExtra);
                    }
                }
            }
        } else if (i == 4) {
            this.f79708b.mo34606a(this.f79721p);
            this.f79716k.scrollToPosition(0);
        } else if (intent != null && intent.getBooleanExtra("did_sign_tos", false)) {
            mo43809e().mo43769d();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f79719n = new aevc(this);
        C16064 r0 = new TestableBroadcastReceiver() {
            /* class com.google.android.gms.locationsharing.settings.LocationSharingSettingsChimeraActivity.C16064 */

            /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
             method: aevn.b(com.google.android.gms.locationsharing.common.model.LocationShare, boolean):void
             arg types: [com.google.android.gms.locationsharing.common.model.LocationShare, int]
             candidates:
              abh.b(android.view.ViewGroup, int):acm
              abh.b(int, int):void
              abh.b(acm, int):void
              aevn.b(com.google.android.gms.locationsharing.common.model.LocationShare, boolean):void */
            /* renamed from: a */
            public final void mo6253a(Context context, Intent intent) {
                List list;
                int resultCode = getResultCode();
                if (resultCode != 2) {
                    LocationSharingSettingsChimeraActivity locationSharingSettingsChimeraActivity = LocationSharingSettingsChimeraActivity.this;
                    int i = LocationSharingSettingsChimeraActivity.f79707j;
                    boolean z = true;
                    locationSharingSettingsChimeraActivity.mo43806a(false, true);
                    AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
                    if (resultCode == 0) {
                        ArrayList b = sef.m35076b(intent, "target_location_shares", LocationShare.CREATOR);
                        int size = b.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            LocationSharingSettingsChimeraActivity.this.f79708b.mo34609b((LocationShare) b.get(i2));
                        }
                        if (accessibilityManager.isEnabled()) {
                            Toast.makeText(context, context.getResources().getQuantityString(C0126R.plurals.location_sharing_update_shares_success_description, b.size(), ((LocationShare) b.get(0)).mo43757d(), Integer.valueOf(b.size())), 0).show();
                        }
                    } else if (resultCode != 1) {
                        aexq.m52658a(LocationSharingSettingsChimeraActivity.this);
                        ArrayList a = ShareTarget.m67010a(intent);
                        SharingCondition sharingCondition = (SharingCondition) sef.m35067a(intent, "sharing_condition", SharingCondition.CREATOR);
                        ArrayList arrayList = new ArrayList(a.size());
                        int size2 = a.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            arrayList.add(LocationShare.m66988a((ShareTarget) a.get(i3), sharingCondition));
                        }
                        int size3 = arrayList.size();
                        for (int i4 = 0; i4 < size3; i4++) {
                            LocationShare locationShare = (LocationShare) arrayList.get(i4);
                            aevn aevn = LocationSharingSettingsChimeraActivity.this.f79708b;
                            if (!locationShare.mo43760f()) {
                                list = aevn.f63903a.f79632b;
                            } else {
                                list = aevn.f63903a.f79633c;
                            }
                            int indexOf = list.indexOf(locationShare);
                            if (indexOf != -1) {
                                LocationShare locationShare2 = (LocationShare) list.get(indexOf);
                                if (locationShare2.mo43762h() == 3) {
                                    aevn.mo34607a(locationShare2);
                                } else if (locationShare2.mo43762h() == 4) {
                                    aevn.mo34610b(locationShare2, true);
                                }
                            }
                        }
                    } else {
                        ArrayList b2 = sef.m35076b(intent, "target_location_shares", LocationShare.CREATOR);
                        if (b2.size() != 1) {
                            z = false;
                        }
                        bmxy.m108600b(z);
                        LocationSharingSettingsChimeraActivity locationSharingSettingsChimeraActivity2 = LocationSharingSettingsChimeraActivity.this;
                        aevi.m52590a(locationSharingSettingsChimeraActivity2, locationSharingSettingsChimeraActivity2.f79709c, locationSharingSettingsChimeraActivity2.f79708b, (LocationShare) b2.get(0), true, LocationSharingSettingsChimeraActivity.this.findViewById(C0126R.C0129id.coordinator_layout));
                    }
                }
            }
        };
        this.f79715i = r0;
        registerReceiver(r0, new IntentFilter("com.google.android.gms.locationsharing.UPDATE_COMPLETE"));
        setContentView((int) C0126R.C0128layout.location_sharing_settings_activity_main);
        findViewById(C0126R.C0129id.progress_bar).setVisibility(8);
        C1341rz aW = mo8628aW();
        aW.mo15853b(true);
        aW.mo15858c(false);
        sex.m35104a(this).mo25440a(78);
        this.f79712f = new aesz(getSupportLoaderManager(), bundle);
        if (bundle != null) {
            this.f79709c = bundle.getString("account_name");
            this.f79718m = (LocationSharingSettings) bundle.getParcelable("displayed_settings");
            this.f79720o = bundle.getInt("update_progress_count");
        } else {
            this.f79709c = getIntent().getStringExtra("account_name");
            this.f79720o = 0;
        }
        if (this.f79709c == null) {
            String[] a = soz.m35792a(soz.m35801d(this, getPackageName()));
            if (a.length > 0) {
                this.f79709c = a[0];
            } else {
                Toast.makeText(this, (int) C0126R.string.location_sharing_no_account_message, 1).show();
                finish();
                return;
            }
        }
        bxvd da = caiu.f174770d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        caiu caiu = (caiu) da.f164949b;
        caiu.f174773b = 1;
        caiu.f174772a |= 1;
        String stringExtra = getIntent().getStringExtra("calling_package_name");
        if (stringExtra != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            caiu caiu2 = (caiu) da.f164949b;
            stringExtra.getClass();
            caiu2.f174772a |= 2;
            caiu2.f174774c = stringExtra;
        } else if (getIntent().getAction() == null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            caiu caiu3 = (caiu) da.f164949b;
            "com.google.android.gms".getClass();
            caiu3.f174772a |= 2;
            caiu3.f174774c = "com.google.android.gms";
        }
        this.f79710d = new aetk(this, (caiu) da.mo74062i(), bundle, null);
        sun sun = new sun(mo8628aW());
        sun.mo26112a(C0126R.string.location_sharing_settings_title);
        sun.f45175a = this;
        sun.f45176b = this.f79709c;
        this.f79717l = sun.mo26111a();
        findViewById(C0126R.C0129id.try_again).setOnClickListener(new aeva(this));
        View findViewById = findViewById(C0126R.C0129id.edit_shares_button);
        if (cfaz.f183554a.mo6606a().mo80793p()) {
            findViewById.setVisibility(8);
        } else {
            findViewById.setOnClickListener(new aevb(this));
        }
        RecyclerView recyclerView = (RecyclerView) findViewById(C0126R.C0129id.location_settings_content);
        recyclerView.setLayoutManager(new aah());
        this.f79716k = recyclerView;
        int i = Build.VERSION.SDK_INT;
        try {
            TypedArray obtainStyledAttributes = obtainStyledAttributes(new TypedValue().data, new int[]{16843829});
            int color = obtainStyledAttributes.getColor(0, -1);
            obtainStyledAttributes.recycle();
            if (color != -1) {
                LinearProgressBar linearProgressBar = (LinearProgressBar) findViewById(C0126R.C0129id.progress_bar);
                azzc b = linearProgressBar.getProgressDrawable();
                b.f100275a = color;
                b.invalidateSelf();
                azzg a2 = linearProgressBar.getIndeterminateDrawable();
                a2.f100295a = color;
                a2.invalidateSelf();
            }
        } catch (Exception e) {
        }
        aesz aesz = this.f79712f;
        if (this.f79722q == null) {
            this.f79722q = aeqc.m52384a(this);
        }
        this.f79711e = new aest(this, this, aesz, bundle, this.f79722q);
        m67062g();
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        MenuItem add = menu.add((int) C0126R.string.location_sharing_location_settings);
        C1264pc.m19829b(add);
        add.setOnMenuItemClickListener(new aevd(this));
        MenuItem add2 = menu.add((int) C0126R.string.location_sharing_info_title);
        C1264pc.m19829b(add2);
        add2.setIcon((int) C0126R.C0127drawable.quantum_ic_info_outline_white_24);
        add2.setOnMenuItemClickListener(new aeve(this));
        MenuItem add3 = menu.add((int) C0126R.string.common_list_apps_menu_help);
        C1264pc.m19829b(add3);
        add3.setOnMenuItemClickListener(new aevf(this));
        return true;
    }

    public final void onDestroy() {
        super.onDestroy();
        aexw.m52662a(this);
        try {
            unregisterReceiver(this.f79715i);
        } catch (IllegalArgumentException e) {
        }
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        suo suo = this.f79717l;
        if (suo != null && this.f79709c != null) {
            String b = suo.getItem(i);
            if (!b.equals(this.f79709c)) {
                aexo.m52653a(this, this.f79709c, mo43809e());
                this.f79710d.mo34553b(13);
                this.f79709c = b;
                this.f79718m = null;
                this.f79714h = false;
                m67062g();
            }
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        super.onPause();
        aexo.m52653a(this, this.f79709c, mo43809e());
        aevn aevn = this.f79708b;
        if (aevn != null) {
            aevn.mo34613d();
        }
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        this.f79713g = false;
        aevn aevn = this.f79708b;
        if (aevn != null) {
            aevn.mo34612c();
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("account_name", this.f79709c);
        bundle.putInt("update_progress_count", this.f79720o);
        aevn aevn = this.f79708b;
        if (aevn != null && aevn.f63905e) {
            bundle.putParcelable("displayed_settings", aevn.f63903a);
        }
        this.f79711e.mo34518a(bundle);
        this.f79712f.mo34533a(bundle);
        this.f79710d.mo34551a(bundle);
    }

    /* renamed from: a */
    public final void mo34514a(int i) {
        aexw.m52662a(this);
        mo43806a(false, false);
        findViewById(C0126R.C0129id.settings_fragment_container).setVisibility(8);
        findViewById(C0126R.C0129id.error_view).setVisibility(0);
        this.f79710d.mo34553b(14);
        TextView textView = (TextView) findViewById(C0126R.C0129id.empty_text);
        String a = aexq.m52657a(textView.getContext(), i);
        if (a != null) {
            textView.setText(a);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    /* renamed from: a */
    public final void mo34590a(LocationShare locationShare) {
        Intent b = mo43807b(3);
        b.putExtra("is_edit", true);
        sef.m35071a(locationShare, b, "target_location_share");
        if (!this.f79713g) {
            this.f79713g = true;
            startActivityForResult(b, 3);
        }
    }

    /* renamed from: a */
    public final void mo34515a(LocationSharingSettings locationSharingSettings) {
        aexw.m52662a(this);
        mo43806a(false, false);
        LocationSharingSettings locationSharingSettings2 = this.f79718m;
        if (locationSharingSettings2 != null) {
            locationSharingSettings = locationSharingSettings2;
        }
        m67060b(locationSharingSettings);
        if (this.f79718m == null && locationSharingSettings.f79631a.booleanValue() && !locationSharingSettings.f79634d.booleanValue() && !locationSharingSettings.mo43766a().isEmpty()) {
            this.f79711e.mo34524e();
        }
        if (ceyd.m138418b()) {
            aexr.m52659a(getApplicationContext(), this.f79709c, true);
        }
    }

    /* renamed from: b */
    public final Intent mo43807b(int i) {
        Intent className = new Intent().setClassName(this, "com.google.android.gms.locationsharing.updateshares.UpdateSharesActivity");
        className.putExtra("account_name", this.f79709c);
        sef.m35071a(mo43809e(), className, "settings_info");
        className.putExtra("pending_intent", PendingIntent.getBroadcast(this, i, new Intent("com.google.android.gms.locationsharing.UPDATE_COMPLETE"), 0));
        return className;
    }

    /* renamed from: c */
    public final void mo34604c(boolean z) {
        if (z) {
            View findViewById = findViewById(C0126R.C0129id.location_settings_content);
            View findViewById2 = findViewById(C0126R.C0129id.empty_settings_view);
            int integer = getResources().getInteger(17694720);
            findViewById2.setAlpha(0.0f);
            findViewById2.setVisibility(0);
            long j = (long) integer;
            findViewById2.animate().alpha(1.0f).setDuration(j).setListener(null);
            if (findViewById.getVisibility() != 8) {
                findViewById.animate().alpha(0.0f).setDuration(j).setListener(new aeuy(findViewById2, findViewById));
                return;
            }
            return;
        }
        findViewById(C0126R.C0129id.empty_settings_view).setVisibility(8);
        findViewById(C0126R.C0129id.location_settings_content).setVisibility(0);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aevn.b(com.google.android.gms.locationsharing.common.model.LocationShare, boolean):void
     arg types: [com.google.android.gms.locationsharing.common.model.LocationShare, int]
     candidates:
      abh.b(android.view.ViewGroup, int):acm
      abh.b(int, int):void
      abh.b(acm, int):void
      aevn.b(com.google.android.gms.locationsharing.common.model.LocationShare, boolean):void */
    /* renamed from: b */
    public final void mo34591b(LocationShare locationShare) {
        if (locationShare.f79630d) {
            new AlertDialog.Builder(this).setMessage((int) C0126R.string.location_sharing_read_only_message).setPositiveButton(17039370, (DialogInterface.OnClickListener) null).setNeutralButton((int) C0126R.string.common_learn_more, new aevg(this)).show();
            return;
        }
        int indexOf = mo43809e().mo43766a().indexOf(locationShare);
        aetk aetk = this.f79710d;
        bxvd da = caje.f174809d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        caje caje = (caje) da.f164949b;
        caje.f174812b = 1;
        int i = caje.f174811a | 1;
        caje.f174811a = i;
        caje.f174811a = i | 2;
        caje.f174813c = indexOf;
        caje caje2 = (caje) da.mo74062i();
        bxvd d = aetk.m52539d(7);
        if (d.f164950c) {
            d.mo74035c();
            d.f164950c = false;
        }
        caix caix = (caix) d.f164949b;
        caix caix2 = caix.f174776l;
        caje2.getClass();
        caix.f174781d = caje2;
        caix.f174778a |= 32;
        aetk.mo34552a((caix) d.mo74062i());
        this.f79708b.mo34610b(locationShare, false);
        mo43808b(true);
        Bundle bundle = new Bundle();
        bundle.putParcelable("target_location_share", locationShare);
        aesz aesz = this.f79712f;
        aesz.mo34532a(aesz.f63756a, bundle, this.f79719n, true);
        aesz.f63756a++;
    }

    /* renamed from: a */
    public final void mo34516a(boolean z) {
        aevn aevn;
        if (z && (aevn = this.f79708b) != null) {
            aevn.mo34606a((View.OnClickListener) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        if (r3 == false) goto L_0x0010;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002c  */
    /* renamed from: a */
    public final void mo43806a(boolean z, boolean z2) {
        int i = 0;
        boolean z3 = true;
        if (z2) {
            if (!z) {
                this.f79720o--;
            } else {
                this.f79720o++;
                View findViewById = findViewById(C0126R.C0129id.progress_bar);
                if (!z3) {
                    i = 8;
                }
                findViewById.setVisibility(i);
            }
        }
        if (this.f79720o <= 0 && !this.f79712f.mo34534a()) {
            z3 = false;
        }
        View findViewById2 = findViewById(C0126R.C0129id.progress_bar);
        if (!z3) {
        }
        findViewById2.setVisibility(i);
    }

    /* renamed from: b */
    public final void mo43808b(boolean z) {
        mo43806a(z, false);
    }
}
