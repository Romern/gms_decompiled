package com.google.android.gms.locationsharing.updateshares;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.support.p002v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.common.people.data.AudienceMember;
import com.google.android.gms.locationsharing.common.model.LocationShare;
import com.google.android.gms.locationsharing.common.model.LocationSharingSettings;
import com.google.android.gms.locationsharing.common.model.ShareTarget;
import com.google.android.gms.locationsharing.common.model.SharingCondition;
import com.google.android.gms.locationsharing.common.p052ui.DisableableFrameLayout;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UpdateSharesChimeraActivity extends Activity implements aess, aesu {

    /* renamed from: q */
    private static final srn f79741q = srn.m36127a(sgj.LOCATION_SHARING);

    /* renamed from: A */
    private aevv f79742A;

    /* renamed from: B */
    private aevq f79743B;

    /* renamed from: C */
    private aest f79744C;

    /* renamed from: D */
    private boolean f79745D = false;

    /* renamed from: E */
    private boolean f79746E = false;

    /* renamed from: F */
    private int f79747F = 0;

    /* renamed from: G */
    private int f79748G;

    /* renamed from: H */
    private rjx f79749H;

    /* renamed from: a */
    public String f79750a;

    /* renamed from: b */
    public LocationShare f79751b;

    /* renamed from: c */
    public List f79752c;

    /* renamed from: d */
    public int f79753d;

    /* renamed from: e */
    public Set f79754e;

    /* renamed from: f */
    public aetk f79755f;

    /* renamed from: g */
    public ResolveInfo f79756g;

    /* renamed from: h */
    public TouchListeningViewAnimator f79757h;

    /* renamed from: i */
    public View f79758i;

    /* renamed from: j */
    public View f79759j;

    /* renamed from: k */
    public RecyclerView f79760k;

    /* renamed from: l */
    public aewd f79761l;

    /* renamed from: m */
    public LoaderManager.LoaderCallbacks f79762m;

    /* renamed from: n */
    public Runnable f79763n;

    /* renamed from: o */
    public final Handler f79764o = new adzt();

    /* renamed from: p */
    public Runnable f79765p;

    /* renamed from: r */
    private SharingCondition f79766r;

    /* renamed from: s */
    private long f79767s = 0;

    /* renamed from: t */
    private Bundle f79768t;

    /* renamed from: u */
    private SharingConditionRadioGroup f79769u;

    /* renamed from: v */
    private Button f79770v;

    /* renamed from: w */
    private View f79771w;

    /* renamed from: x */
    private int f79772x;

    /* renamed from: y */
    private aexb f79773y;

    /* renamed from: z */
    private aexb f79774z;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.widget.LinearLayout, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    private final DisableableFrameLayout m67084a(aevz aevz) {
        LinearLayout c = mo43828c();
        DisableableFrameLayout disableableFrameLayout = (DisableableFrameLayout) LayoutInflater.from(this).inflate((int) C0126R.C0128layout.location_sharing_share_item, (ViewGroup) c, false);
        if (c.getChildCount() > 0) {
            View view = new View(this);
            view.setLayoutParams(new LinearLayout.LayoutParams(this.f79772x, -1));
            c.addView(view);
        }
        c.addView(disableableFrameLayout);
        new aewb(disableableFrameLayout).mo34617a(this, aevz);
        return disableableFrameLayout;
    }

    /* renamed from: b */
    private final boolean m67087b(LocationSharingSettings locationSharingSettings) {
        if (!locationSharingSettings.mo43768c() && this.f79744C.mo34522c()) {
            return false;
        }
        Intent className = new Intent().setClassName(this, "com.google.android.gms.locationsharing.activity.OnboardingActivity");
        Bundle bundle = new Bundle();
        this.f79768t = bundle;
        bundle.putString("account_name", this.f79750a);
        this.f79768t.putBoolean("has_signed_tos", !locationSharingSettings.mo43768c());
        this.f79768t.putBoolean("is_location_history_enabled", this.f79744C.mo34522c());
        this.f79768t.putBoolean("is_korean", locationSharingSettings.f79636f.booleanValue());
        className.putExtras(this.f79768t);
        className.putExtra("session_id", this.f79755f.f63776a);
        startActivityForResult(className, 2);
        return true;
    }

    /* renamed from: d */
    private final void m67088d(String str) {
        super.setTitle(str);
        ((TextView) this.f79771w.findViewById(C0126R.C0129id.title)).setText(str);
    }

    /* renamed from: e */
    private final void m67089e() {
        aexw.m52665a(this, C0126R.string.location_sharing_checking_settings_progress, true, new aewo(this));
    }

    /* renamed from: a */
    public final void mo34513a() {
    }

    /* renamed from: a */
    public final void mo34516a(boolean z) {
    }

    /* renamed from: b */
    public final void mo34526b(String str) {
    }

    /* renamed from: c */
    public final Intent mo43827c(ArrayList arrayList) {
        Intent intent = new Intent();
        intent.putExtra("account_name", this.f79750a);
        ShareTarget.m67011a(arrayList, intent);
        SharingCondition b = mo43824b();
        if (b == null) {
            b = this.f79766r;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            arrayList2.add(LocationShare.m66988a((ShareTarget) arrayList.get(i), b));
        }
        sef.m35072a(arrayList2, intent, "target_location_shares");
        SharingCondition b2 = mo43824b();
        if (b2 != null) {
            sef.m35071a(b2, intent, "sharing_condition");
            if (b2.mo43781c() == 1) {
                z = true;
            }
            intent.putExtra("is_persistent", z);
            if (!z) {
                intent.putExtra("duration", b2.mo43780b());
            }
        }
        Bundle bundle = this.f79768t;
        if (bundle != null) {
            intent.putExtra("onboarding_bundle", bundle);
        }
        return intent;
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
    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1) {
            if (i != 1) {
                if (i == 2) {
                    Bundle bundle = this.f79768t;
                    if (bundle != null) {
                        bundle.putInt("activity_result", -1);
                    }
                    LocationSharingSettings locationSharingSettings = (LocationSharingSettings) sef.m35067a(getIntent(), "settings_info", LocationSharingSettings.CREATOR);
                    locationSharingSettings.mo43769d();
                    sef.m35071a(locationSharingSettings, getIntent(), "settings_info");
                    Intent intent2 = new Intent();
                    intent2.putExtra("did_sign_tos", true);
                    intent2.putExtra("onboarding_bundle", this.f79768t);
                    setResult(0, intent2);
                    this.f79745D = true;
                    return;
                } else if (i != 4) {
                    return;
                }
            }
            mo43823a(intent.getParcelableArrayListExtra("extra_added_audience_members"));
        } else if (i == 4) {
            finish();
        } else if (i == 2) {
            Bundle bundle2 = this.f79768t;
            if (bundle2 != null) {
                bundle2.putInt("activity_result", i2);
            }
            Intent intent3 = new Intent();
            intent3.putExtra("onboarding_bundle", this.f79768t);
            setResult(0, intent3);
            if (this.f79746E) {
                finish();
            }
        }
    }

    public final void onBackPressed() {
        TouchListeningViewAnimator touchListeningViewAnimator = this.f79757h;
        if (touchListeningViewAnimator == null || touchListeningViewAnimator.getCurrentView() != this.f79760k) {
            super.onBackPressed();
        } else {
            this.f79757h.showPrevious();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x03a4  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x03a7  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x03b4  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x03b7  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x03c4  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x03c7  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x03dd  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x04d6  */
    public final void onCreate(Bundle bundle) {
        String str;
        SharingCondition sharingCondition;
        boolean z;
        DisableableFrameLayout disableableFrameLayout;
        DisableableFrameLayout disableableFrameLayout2;
        int i;
        Bundle bundle2 = bundle;
        super.onCreate(bundle);
        int i2 = Build.VERSION.SDK_INT;
        getWindow().setStatusBarColor(0);
        this.f79773y = new aexb(this, true);
        this.f79774z = new aexb(this, false);
        this.f79742A = new aevv(new aewp(this));
        this.f79743B = new aevq(new aewq(this));
        this.f79762m = new aewr(this);
        if (cfaz.f183554a.mo6606a().mo80786i() || aext.m52661a(this, getIntent(), getCallingActivity())) {
            if (bundle2 != null) {
                this.f79756g = (ResolveInfo) bundle2.getParcelable("create_link_resolve_info");
                ArrayList a = sef.m35070a(bundle2, "selected_one_touch_targets", AudienceMember.CREATOR);
                if (a != null) {
                    this.f79754e = new HashSet(a);
                }
            }
            if (this.f79754e == null) {
                this.f79754e = new HashSet();
            }
            setContentView((int) C0126R.C0128layout.location_sharing_update_shares_activity);
            Intent intent = getIntent();
            String stringExtra = intent.getStringExtra("account_name");
            this.f79750a = stringExtra;
            if (stringExtra != null) {
                if (this.f79749H == null) {
                    this.f79749H = aeqc.m52384a(this);
                }
                this.f79744C = new aest(this, this, new aesz(getSupportLoaderManager(), bundle2), bundle, this.f79749H);
                bxvd da = caiu.f174770d.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                caiu caiu = (caiu) da.f164949b;
                caiu.f174773b = 3;
                caiu.f174772a |= 1;
                if (getCallingActivity() != null) {
                    str = getCallingActivity().getPackageName();
                } else {
                    str = null;
                }
                if (str != null) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    caiu caiu2 = (caiu) da.f164949b;
                    str.getClass();
                    caiu2.f174772a |= 2;
                    caiu2.f174774c = str;
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
                this.f79755f = new aetk(this, (caiu) da.mo74062i(), bundle2, aetk.m52537a());
                int a2 = bzmd.m125924a(intent.getIntExtra("client_to_notify", 2));
                this.f79748G = a2;
                if (a2 == 0) {
                    this.f79748G = 3;
                }
                LocationShare locationShare = (LocationShare) sef.m35067a(intent, "target_location_share", LocationShare.CREATOR);
                if (locationShare == null) {
                    sharingCondition = (SharingCondition) sef.m35067a(intent, "sharing_condition", SharingCondition.CREATOR);
                    if (sharingCondition == null) {
                        String stringExtra2 = intent.getStringExtra("destination_description");
                        long longExtra = intent.getLongExtra("destination_eta_ms", 0);
                        long longExtra2 = intent.getLongExtra("duration", 0);
                        if (stringExtra2 == null || longExtra2 == 0) {
                            long j = longExtra2;
                            sharingCondition = j == 0 ? SharingCondition.m67019a(TimeUnit.HOURS.toMillis(1)) : j != -1 ? SharingCondition.m67019a(j) : SharingCondition.m67018a();
                        } else {
                            this.f79767s = TimeUnit.MILLISECONDS.toSeconds(longExtra2);
                            long longExtra3 = intent.getLongExtra("destination_cell_id", 0);
                            long j2 = longExtra2;
                            long longExtra4 = intent.getLongExtra("destination_fingerprint", 0);
                            LatLng latLng = (LatLng) sef.m35067a(intent, "destination_lat_lng", LatLng.CREATOR);
                            if (longExtra3 == 0 || longExtra4 == 0) {
                                sharingCondition = SharingCondition.m67020a(SharingCondition.Destination.m67024a(stringExtra2, longExtra, latLng));
                            } else {
                                sharingCondition = new SharingCondition(2, j2, SharingCondition.Destination.m67023a(stringExtra2, longExtra, new SharingCondition.FeatureId(longExtra3, longExtra4)), SystemClock.elapsedRealtime());
                            }
                        }
                    }
                } else {
                    sharingCondition = locationShare.f79628b;
                }
                this.f79766r = sharingCondition;
                LocationShare locationShare2 = (LocationShare) sef.m35067a(intent, "target_location_share", LocationShare.CREATOR);
                if (locationShare2 == null) {
                    ShareTarget a3 = ShareTarget.m67006a(intent.getBundleExtra("share_target"));
                    if (a3 != null) {
                        locationShare2 = LocationShare.m66988a(a3, sharingCondition);
                    } else {
                        locationShare2 = null;
                    }
                }
                this.f79751b = locationShare2;
                long longExtra5 = getIntent().getLongExtra("auto_dismiss_ms", 0);
                this.f79757h = (TouchListeningViewAnimator) findViewById(C0126R.C0129id.update_shares_root);
                if (longExtra5 != 0) {
                    aewt aewt = new aewt(this);
                    this.f79765p = aewt;
                    this.f79764o.postDelayed(aewt, longExtra5);
                    this.f79757h.f79740a = new aewu(this, longExtra5);
                }
                this.f79757h.setInAnimation(this, C0126R.anim.location_sharing_slide_in);
                this.f79757h.setOutAnimation(this, C0126R.anim.location_sharing_slide_out);
                this.f79760k = (RecyclerView) findViewById(C0126R.C0129id.share_apps_view);
                aewv aewv = new aewv(this);
                this.f79757h.setOnClickListener(aewv);
                findViewById(C0126R.C0129id.filler).setOnClickListener(aewv);
                Intent intent2 = getIntent();
                View findViewById = findViewById(C0126R.C0129id.journey_share_container);
                View findViewById2 = findViewById(C0126R.C0129id.update_shares_container);
                boolean booleanExtra = intent2.getBooleanExtra("is_edit", false);
                if (this.f79766r.mo43781c() == 3 && !booleanExtra) {
                    this.f79771w = findViewById;
                    findViewById.setVisibility(0);
                    findViewById2.setVisibility(8);
                    m67085a(C0126R.dimen.location_sharing_normal_padding, 0);
                    m67086a((List) sef.m35076b(getIntent(), "one_touch_targets", AudienceMember.CREATOR));
                } else {
                    this.f79771w = findViewById2;
                    findViewById.setVisibility(8);
                    findViewById2.setVisibility(0);
                    m67085a(C0126R.dimen.location_sharing_large_padding, C0126R.dimen.location_sharing_normal_padding);
                    m67088d(getString(C0126R.string.location_sharing_untargeted_update_shares_title));
                    this.f79769u = (SharingConditionRadioGroup) findViewById(C0126R.C0129id.sharing_condition_radiogroup);
                    this.f79770v = (Button) findViewById(C0126R.C0129id.share_button);
                    Intent intent3 = getIntent();
                    int intExtra = intent3.getIntExtra("accent_color", -1);
                    if (intExtra != -1) {
                        this.f79769u.mo43813a(intExtra);
                    }
                    SharingConditionRadioGroup sharingConditionRadioGroup = this.f79769u;
                    SharingCondition sharingCondition2 = this.f79766r;
                    if (sharingCondition2 != null) {
                        int c = sharingCondition2.mo43781c();
                        int i3 = c - 1;
                        if (c == 0) {
                            throw null;
                        } else if (i3 == 0) {
                            sharingConditionRadioGroup.check(sharingConditionRadioGroup.mo43818e());
                        } else if (i3 == 1) {
                            long b = sharingCondition2.mo43780b();
                            int i4 = 1;
                            while (true) {
                                if (i4 < SharingConditionRadioGroup.f79724a.length) {
                                    if (TimeUnit.MINUTES.toMillis(Long.parseLong(SharingConditionRadioGroup.f79724a[i4])) > b) {
                                        sharingConditionRadioGroup.mo43815b(i4 - 1);
                                        break;
                                    }
                                    i4++;
                                } else {
                                    sharingConditionRadioGroup.mo43815b(SharingConditionRadioGroup.f79724a.length - 1);
                                    break;
                                }
                            }
                            sharingConditionRadioGroup.check(sharingConditionRadioGroup.mo43816c());
                        } else if (i3 == 2) {
                            sharingConditionRadioGroup.findViewById(C0126R.C0129id.destination_share_container).setVisibility(0);
                            ((TextView) sharingConditionRadioGroup.findViewById(C0126R.C0129id.destination_text)).setText(sharingCondition2.f79645c.f79647a);
                            sharingConditionRadioGroup.f79731h = sharingCondition2;
                            sharingConditionRadioGroup.check(sharingConditionRadioGroup.mo43817d());
                        }
                    }
                    int c2 = this.f79766r.mo43781c();
                    if (c2 != 3) {
                        LocationShare locationShare3 = this.f79751b;
                        if (locationShare3 == null) {
                            z = true;
                        } else if (locationShare3.mo43756c()) {
                            z = true;
                        }
                        boolean booleanExtra2 = intent3.getBooleanExtra("is_edit", false);
                        SharingConditionRadioGroup sharingConditionRadioGroup2 = this.f79769u;
                        sharingConditionRadioGroup2.findViewById(C0126R.C0129id.temporary_share_container).setVisibility(c2 != 3 ? 8 : 0);
                        sharingConditionRadioGroup2.findViewById(C0126R.C0129id.persistent_share_container).setVisibility(z ? 8 : 0);
                        sharingConditionRadioGroup2.findViewById(C0126R.C0129id.stop_sharing_container).setVisibility(booleanExtra2 ? 8 : 0);
                        View findViewById3 = findViewById(C0126R.C0129id.share_target_footer);
                        View findViewById4 = findViewById(C0126R.C0129id.share_button_container);
                        if (this.f79751b == null) {
                            findViewById4.setVisibility(0);
                            findViewById3.setVisibility(8);
                            int intExtra2 = getIntent().getIntExtra("accent_color", -1);
                            if (intExtra2 != -1) {
                                this.f79770v.setTextColor(intExtra2);
                            }
                            this.f79770v.setOnClickListener(new aeww(this));
                            boolean booleanExtra3 = getIntent().getBooleanExtra("is_edit", false);
                            Button button = this.f79770v;
                            if (!booleanExtra3) {
                                i = C0126R.string.common_share;
                            } else {
                                i = C0126R.string.location_sharing_settings_edit_button;
                            }
                            button.setText(i);
                            boolean f = this.f79751b.mo43760f();
                            int i5 = C0126R.string.location_sharing_targeted_update_shares_edit_title;
                            if (!f) {
                                if (!getIntent().getBooleanExtra("is_edit", false)) {
                                    i5 = C0126R.string.location_sharing_targeted_update_shares_title;
                                }
                                m67088d(getString(i5, new Object[]{this.f79751b.mo43757d()}));
                                if (aexk.m52648c(this.f79751b.mo43755b())) {
                                    this.f79771w.findViewById(C0126R.C0129id.share_sms_warning).setVisibility(0);
                                }
                            } else {
                                boolean booleanExtra4 = getIntent().getBooleanExtra("is_edit", false);
                                if (!booleanExtra4) {
                                    i5 = C0126R.string.location_sharing_targeted_update_shares_title;
                                } else if (this.f79751b.f79627a.mo43773b() != aetf.CONTACT) {
                                    i5 = C0126R.string.location_sharing_change_sharing_duration;
                                }
                                m67088d(getString(i5, new Object[]{this.f79751b.mo43757d()}));
                                if (booleanExtra4 && this.f79751b.mo43758e() != null) {
                                    findViewById(C0126R.C0129id.copy_link_header).setVisibility(0);
                                    ((TextView) findViewById(C0126R.C0129id.link_text)).setText(this.f79751b.mo43758e());
                                    Button button2 = (Button) findViewById(C0126R.C0129id.copy_link_button);
                                    int intExtra3 = getIntent().getIntExtra("accent_color", -1);
                                    if (intExtra3 != -1) {
                                        button2.setTextColor(intExtra3);
                                    }
                                    button2.setOnClickListener(new aews(this));
                                }
                            }
                        } else {
                            findViewById4.setVisibility(8);
                            findViewById3.setVisibility(0);
                            ArrayList b2 = sef.m35076b(getIntent(), "one_touch_targets", AudienceMember.CREATOR);
                            if (b2 == null || b2.isEmpty()) {
                                C1240of a4 = aevx.m52625a(this, this.f79750a);
                                this.f79752c = new ArrayList(((List) a4.f26799b).size());
                                for (ResolveInfo resolveInfo : (List) a4.f26799b) {
                                    this.f79752c.add(new aevw(resolveInfo, this.f79774z));
                                }
                                m67084a(this.f79742A);
                                aevw aevw = new aevw((ResolveInfo) a4.f26798a, this.f79773y);
                                if (a4.f26798a != null) {
                                    disableableFrameLayout = m67084a(aevw);
                                } else {
                                    disableableFrameLayout = null;
                                }
                                if (!this.f79752c.isEmpty()) {
                                    disableableFrameLayout2 = m67084a(this.f79743B);
                                } else {
                                    disableableFrameLayout2 = null;
                                }
                                this.f79769u.setOnCheckedChangeListener(new aewm(this, disableableFrameLayout2, disableableFrameLayout));
                            } else {
                                m67086a((List) b2);
                            }
                        }
                    }
                    z = false;
                    boolean booleanExtra22 = intent3.getBooleanExtra("is_edit", false);
                    SharingConditionRadioGroup sharingConditionRadioGroup22 = this.f79769u;
                    sharingConditionRadioGroup22.findViewById(C0126R.C0129id.temporary_share_container).setVisibility(c2 != 3 ? 8 : 0);
                    sharingConditionRadioGroup22.findViewById(C0126R.C0129id.persistent_share_container).setVisibility(z ? 8 : 0);
                    sharingConditionRadioGroup22.findViewById(C0126R.C0129id.stop_sharing_container).setVisibility(booleanExtra22 ? 8 : 0);
                    View findViewById32 = findViewById(C0126R.C0129id.share_target_footer);
                    View findViewById42 = findViewById(C0126R.C0129id.share_button_container);
                    if (this.f79751b == null) {
                    }
                }
                LocationSharingSettings locationSharingSettings = (LocationSharingSettings) sef.m35067a(intent, "settings_info", LocationSharingSettings.CREATOR);
                if (!(locationSharingSettings != null || (locationSharingSettings = aexo.m52652a(this, this.f79750a)) == null || locationSharingSettings.mo43770e() == 1)) {
                    locationSharingSettings = null;
                }
                this.f79744C.mo34520a(this.f79750a, locationSharingSettings);
                if (this.f79756g != null) {
                    aexw.m52663a(this, C0126R.string.location_sharing_create_link_progress);
                    getSupportLoaderManager().initLoader(1, null, this.f79762m);
                    return;
                }
                return;
            }
            finish();
            return;
        }
        ((bnsl) f79741q.mo68390d()).mo68405a("Calling Activity is not whitelisted for Location Sharing settings.");
        finish();
    }

    public final void onDestroy() {
        super.onDestroy();
        aexw.m52662a(this);
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        if (this.f79745D) {
            this.f79745D = false;
            Runnable runnable = this.f79763n;
            if (runnable != null) {
                runnable.run();
                this.f79763n = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f79744C.mo34518a(bundle);
        this.f79755f.mo34551a(bundle);
        bundle.putParcelable("create_link_resolve_info", this.f79756g);
        sef.m35073a(this.f79754e, bundle, "selected_one_touch_targets");
    }

    /* renamed from: d */
    public final boolean mo43829d() {
        LocationSharingSettings locationSharingSettings = (LocationSharingSettings) sef.m35067a(getIntent(), "settings_info", LocationSharingSettings.CREATOR);
        int i = this.f79747F;
        if (i != 0) {
            mo34514a(i);
            this.f79747F = 0;
        } else if (!this.f79744C.mo34521b()) {
            m67089e();
        } else if (!m67087b(locationSharingSettings)) {
            return true;
        } else {
            return false;
        }
        return false;
    }

    /* renamed from: a */
    private final void m67085a(int i, int i2) {
        int i3;
        int dimensionPixelSize = getResources().getDimensionPixelSize(i);
        int i4 = dimensionPixelSize + dimensionPixelSize;
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(C0126R.dimen.location_sharing_share_item_width);
        if (i2 != 0) {
            i3 = getResources().getDimensionPixelSize(i2);
        } else {
            i3 = 0;
        }
        this.f79772x = i3;
        int i5 = getResources().getDisplayMetrics().widthPixels;
        int i6 = this.f79772x;
        this.f79753d = ((i5 - i4) + i6) / (dimensionPixelSize2 + i6);
    }

    /* renamed from: b */
    public final SharingCondition mo43824b() {
        SharingConditionRadioGroup sharingConditionRadioGroup = this.f79769u;
        return sharingConditionRadioGroup != null ? sharingConditionRadioGroup.mo43814b() : this.f79766r;
    }

    /* renamed from: b */
    public final void mo43825b(int i) {
        if (i != 4) {
            this.f79755f.mo34550a(2, mo43824b());
        }
        Intent className = new Intent().setClassName(this, "com.google.android.gms.locationsharing.updateshares.people.PeopleSelectionActivity");
        className.putExtras(getIntent().getExtras());
        sef.m35072a(this.f79754e, className, "extra_initial_audience_members");
        sef.m35071a(mo43824b(), className, "sharing_condition");
        className.putExtra("session_id", this.f79755f.f63776a);
        startActivityForResult(className, i);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.widget.LinearLayout, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    private final void m67086a(List list) {
        if (list != null && !list.isEmpty()) {
            View findViewById = findViewById(C0126R.C0129id.bottom_share_container);
            this.f79758i = findViewById;
            this.f79759j = findViewById.findViewById(C0126R.C0129id.sms_warning);
            this.f79758i.setVisibility(8);
            Button button = (Button) this.f79758i.findViewById(C0126R.C0129id.select);
            if (!getIntent().getBooleanExtra("enable_multi_select", false)) {
                button.setVisibility(8);
            } else {
                int intExtra = getIntent().getIntExtra("accent_color", -1);
                if (intExtra != -1) {
                    button.setTextColor(intExtra);
                }
                button.setOnClickListener(new aewl(this));
                button.setText((int) C0126R.string.common_share);
            }
            C1240of a = aevx.m52625a(this, this.f79750a);
            ArrayList arrayList = new ArrayList(((List) a.f26799b).size() + 2);
            this.f79752c = arrayList;
            arrayList.add(this.f79742A);
            this.f79752c.add(new aevw((ResolveInfo) a.f26798a, this.f79774z));
            for (ResolveInfo resolveInfo : (List) a.f26799b) {
                this.f79752c.add(new aevw(resolveInfo, this.f79774z));
            }
            boolean booleanExtra = getIntent().getBooleanExtra("enable_multi_select", false);
            int min = Math.min(this.f79753d - 1, list.size());
            for (int i = 0; i < min; i++) {
                aevs aevs = new aevs((AudienceMember) list.get(i), new aexa(this, i, booleanExtra), this, i + 2);
                LinearLayout c = mo43828c();
                View inflate = LayoutInflater.from(this).inflate((int) C0126R.C0128layout.location_sharing_one_touch_item, (ViewGroup) c, false);
                if (c.getChildCount() > 0) {
                    View view = new View(this);
                    view.setLayoutParams(new LinearLayout.LayoutParams(this.f79772x, -1));
                    c.addView(view);
                }
                c.addView(inflate);
                new aevu(inflate).mo34617a(this, aevs);
                if (this.f79754e.remove(list.get(i))) {
                    inflate.performClick();
                }
                if (!getIntent().getBooleanExtra("enable_multi_select", false) && aexk.m52648c((AudienceMember) list.get(i))) {
                    this.f79758i.setVisibility(0);
                    this.f79759j.setVisibility(0);
                }
            }
            if (!this.f79752c.isEmpty()) {
                this.f79743B.f63915a = C0126R.C0127drawable.quantum_ic_more_horiz_grey600_36;
                LinearLayout c2 = mo43828c();
                View inflate2 = LayoutInflater.from(this).inflate((int) C0126R.C0128layout.location_sharing_one_touch_item, (ViewGroup) c2, false);
                if (c2.getChildCount() > 0) {
                    View view2 = new View(this);
                    view2.setLayoutParams(new LinearLayout.LayoutParams(this.f79772x, -1));
                    c2.addView(view2);
                }
                c2.addView(inflate2);
                new aewb(inflate2).mo34617a(this, this.f79743B);
                return;
            }
            return;
        }
        this.f79746E = true;
        findViewById(C0126R.C0129id.bottom_sheet).setVisibility(4);
        new aewx(this).mo34619a(null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final LinearLayout mo43828c() {
        View view = this.f79771w;
        if (view == null) {
            return null;
        }
        View findViewById = view.findViewById(C0126R.C0129id.share_item_container);
        if (findViewById == null) {
            findViewById = this.f79771w.findViewById(C0126R.C0129id.journey_share_item_container);
        }
        return (LinearLayout) findViewById;
    }

    /* renamed from: c */
    public final void mo34527c(String str) {
        if ("tag_error_settings".equals(str)) {
            m67089e();
            this.f79744C.mo34519a(this.f79750a);
        }
    }

    /* renamed from: b */
    public final void mo43826b(ArrayList arrayList) {
        boolean booleanExtra = getIntent().getBooleanExtra("is_edit", false);
        SharingCondition b = mo43824b();
        if (booleanExtra && b != null && b.mo43781c() == 3) {
            finish();
            return;
        }
        boolean z = true;
        if (getIntent().getAction() != null && (!booleanExtra || !getIntent().getBooleanExtra("enable_overwrite_all", false))) {
            z = false;
        }
        Intent c = mo43827c(arrayList);
        Intent startIntent = IntentOperation.getStartIntent(this, UpdateSharesIntentOperation.class, "com.google.android.gms.locationsharing.update_shares");
        startIntent.putExtras(c.getExtras());
        startIntent.putExtra("is_edit", getIntent().getBooleanExtra("is_edit", false));
        startIntent.putExtra("journey_expiration_sec", this.f79767s);
        startIntent.putExtra("enable_overwrite_all", z);
        int i = this.f79748G;
        int i2 = i - 1;
        if (i != 0) {
            startIntent.putExtra("client_to_notify", i2);
            startIntent.putExtra("pending_intent", getIntent().getParcelableExtra("pending_intent"));
            sef.m35071a(this.f79766r, startIntent, "old_sharing_condition");
            startService(startIntent);
            setResult(-1, c);
            finish();
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public final void mo34514a(int i) {
        if (this.f79763n != null) {
            aexw.m52662a(this);
            aesv a = aesv.m52523a(null, aexq.m52657a(this, i), getString(C0126R.string.location_sharing_try_again), null);
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            beginTransaction.add(a, "tag_error_settings");
            beginTransaction.commitAllowingStateLoss();
            return;
        }
        this.f79747F = i;
    }

    /* renamed from: a */
    public final void mo34515a(LocationSharingSettings locationSharingSettings) {
        LocationSharingSettings locationSharingSettings2 = (LocationSharingSettings) sef.m35067a(getIntent(), "settings_info", LocationSharingSettings.CREATOR);
        if (locationSharingSettings2 == null) {
            sef.m35071a(locationSharingSettings, getIntent(), "settings_info");
        } else {
            locationSharingSettings = locationSharingSettings2;
        }
        if (this.f79763n != null) {
            aexw.m52662a(this);
            if (!m67087b(locationSharingSettings)) {
                this.f79763n.run();
                this.f79763n = null;
            }
        }
    }

    /* renamed from: a */
    public final void mo34525a(String str) {
        if ("tag_error_settings".equals(str)) {
            this.f79763n = null;
            aexw.m52662a(this);
            this.f79744C.mo34520a(this.f79750a, null);
        }
    }

    /* renamed from: a */
    public final void mo43823a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AudienceMember audienceMember = (AudienceMember) arrayList.get(i);
            if (aexk.m52647b(audienceMember)) {
                arrayList2.add(ShareTarget.m67007a(audienceMember));
            } else if (audienceMember == null || !audienceMember.mo17847c() || !audienceMember.f30295e.substring(0, 2).equals("t:")) {
                arrayList2.add(ShareTarget.m67012b(audienceMember));
            }
        }
        mo43826b(arrayList2);
    }
}
