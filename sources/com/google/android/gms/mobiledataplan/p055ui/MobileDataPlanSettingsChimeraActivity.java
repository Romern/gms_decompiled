package com.google.android.gms.mobiledataplan.p055ui;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.p002v7.widget.RecyclerView;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mobiledataplan.MdpCarrierPlanIdResponse;

/* renamed from: com.google.android.gms.mobiledataplan.ui.MobileDataPlanSettingsChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MobileDataPlanSettingsChimeraActivity extends deu {

    /* renamed from: e */
    private static final srn f80329e = srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);

    /* renamed from: f */
    private static boolean f80330f = false;

    /* renamed from: b */
    public float f80331b;

    /* renamed from: c */
    public agtw f80332c;

    /* renamed from: d */
    public boolean f80333d;

    /* renamed from: g */
    private boolean f80334g = false;

    /* renamed from: h */
    private int f80335h = C0126R.C0128layout.settings_activity;

    /* renamed from: i */
    private agvf f80336i = null;

    /* renamed from: a */
    public static bszh m67304a(Activity activity) {
        bxvd da = bszh.f147822d.mo74144da();
        String c = agyt.m55306c(activity.getApplicationContext());
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        c.getClass();
        ((bszh) da.f164949b).f147825b = c;
        String string = activity.getString(C0126R.string.support_page_error_message);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        string.getClass();
        ((bszh) da.f164949b).f147824a = string;
        return (bszh) da.mo74062i();
    }

    /* renamed from: e */
    public final void mo44117e() {
        findViewById(C0126R.C0129id.user_notice_card).setVisibility(8);
    }

    /* renamed from: g */
    public final void mo44118g() {
        agrl.m54942a().mo35987a(26, this.f80336i.toString(), "R.id.error_layout", bygd.ERROR_PAGE_HIDDEN, System.currentTimeMillis(), agvh.m55172b());
        findViewById(C0126R.C0129id.error_screen_flipper).setVisibility(8);
        findViewById(C0126R.C0129id.content_layout).setVisibility(0);
    }

    /* renamed from: h */
    public final boolean mo44119h() {
        return findViewById(C0126R.C0129id.error_screen_flipper).getVisibility() == 0;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: agve.a(agtw, boolean):void
     arg types: [agtw, int]
     candidates:
      agve.a(java.lang.String, agtw):void
      agve.a(agtw, boolean):void */
    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 2333) {
            if (i == 2334 && i2 != -1) {
                this.f80332c.mo36097a(true);
            }
        } else if (i2 != -1) {
            agve.m55161a(this.f80332c, false);
            mo44115a(new rjp(new Status(27023)));
        } else {
            agve.m55161a(this.f80332c, true);
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i = Build.VERSION.SDK_INT;
        if (mo44119h() || !getContainerActivity().isInMultiWindowMode()) {
            if (mo44119h()) {
                mo44114a(this.f80336i);
            }
            agtw agtw = this.f80332c;
            if (agtw.f66529a != null) {
                agtw.f66536h.mo171aJ();
            }
        } else if (cfnm.f184575a.mo6606a().mo81677j()) {
            recreate();
        } else {
            finish();
            startActivity(getIntent());
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        agtw agtw;
        if (!agqg.m54844K().booleanValue()) {
            ((bnsl) f80329e.mo68388c()).mo68405a("Mobiledataplan's Settings is not enabled in this device yet.");
            finish();
            return;
        }
        super.onCreate(bundle);
        setTitle((int) C0126R.string.mobile_data_plan);
        setContentView(this.f80335h);
        C1341rz aW = mo8628aW();
        aW.mo15841a(4, 4);
        aW.mo15853b(true);
        int i = Build.VERSION.SDK_INT;
        if (cfnm.m140639j()) {
            aW.mo15851b(new ColorDrawable(getResources().getColor(C0126R.color.carrier_header_background)));
        } else {
            aW.mo15851b(new ColorDrawable(getResources().getColor(C0126R.color.top_entry_grey)));
        }
        this.f80331b = aW.mo15869h();
        aW.mo15839a(0.0f);
        RecyclerView recyclerView = (RecyclerView) findViewById(C0126R.C0129id.dataplan_recyclerview);
        recyclerView.setLayoutManager(new aah());
        recyclerView.addOnScrollListener(new agui(this, aW));
        this.f80333d = false;
        f80330f = false;
        if (cfnm.m140635f() && agtw.m55116b() != null) {
            ((bnsl) f80329e.mo68390d()).mo68405a("GlobalStateHelper was NOT null, calling destroyInstance() first.");
            agtw.m55115a();
        }
        agvh.m55171a();
        synchronized (agtw.f66519w) {
            if (agtw.f66520x != null) {
                String valueOf = String.valueOf(agtw.f66520x.toString());
                throw new IllegalStateException(valueOf.length() == 0 ? new String("createInstance called when instance != null! Instance: ") : "createInstance called when instance != null! Instance: ".concat(valueOf));
            } else {
                agtw.f66520x = new agtw(this);
                agtw = agtw.f66520x;
            }
        }
        this.f80332c = agtw;
        mo44116a(true, this.f80334g);
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        if (findViewById(C0126R.C0129id.support_channel_page_layout) != null) {
            return false;
        }
        getMenuInflater().inflate(C0126R.C0130menu.mobiledataplan_settings_menu, menu);
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        if (!cfnm.m140635f() || this.f80332c == agtw.m55116b()) {
            agrl.m54942a().mo35987a(37, (String) null, (String) null, bygd.TERMINATE_MDP_UI, System.currentTimeMillis(), agvh.m55172b());
            agtw.m55115a();
            agvh.f66649a = null;
        }
        cflu.f184297a.mo6606a().mo81421l();
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f80334g = true;
        setIntent(intent);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId != 16908332) {
            Bitmap bitmap = null;
            if (itemId == C0126R.C0129id.feedback) {
                wwr a = wvu.m42361a(this);
                try {
                    View rootView = getWindow().getDecorView().getRootView();
                    Bitmap createBitmap = Bitmap.createBitmap(rootView.getWidth(), rootView.getHeight(), Bitmap.Config.RGB_565);
                    rootView.draw(new Canvas(createBitmap));
                    bitmap = createBitmap;
                } catch (IllegalArgumentException e) {
                    bnsl bnsl = (bnsl) f80329e.mo68388c();
                    bnsl.mo68437a(e);
                    bnsl.mo68405a("MobileDataPlan feedback got screenshot failed!");
                }
                wwu wwu = new wwu(this);
                wwu.mo29497b(bitmap);
                wwu.f51499d = "com.google.android.gms.mobiledataplan.USER_INITIATED_FEEDBACK_REPORT";
                MdpCarrierPlanIdResponse mdpCarrierPlanIdResponse = this.f80332c.f66540l;
                if (mdpCarrierPlanIdResponse == null) {
                    a.mo29487a(wwu.mo29490a());
                } else {
                    wwu.mo29492a("carrier ID", Long.toString(mdpCarrierPlanIdResponse.f80155e));
                    if (!TextUtils.isEmpty(mdpCarrierPlanIdResponse.f80151a)) {
                        wwu.mo29492a("CPID", mdpCarrierPlanIdResponse.f80151a);
                    }
                    a.mo29487a(wwu.mo29490a());
                }
                return true;
            } else if (itemId == C0126R.C0129id.refresh) {
                agrl.m54942a().mo35987a(13, "refresh_button", "R.id.refresh", bygd.REFRESH_DATA_PLAN, System.currentTimeMillis(), agvh.m55172b());
                this.f80332c.mo36097a(false);
                return true;
            } else if (itemId == C0126R.C0129id.stop_syncing) {
                new AlertDialog.Builder(this).setTitle((int) C0126R.string.stop_syncing_confirm_dialog_title).setMessage(getString(C0126R.string.stop_syncing_confirm_dialog_message, new Object[]{this.f80332c.mo36104h()})).setPositiveButton((int) C0126R.string.stop_syncing_confirm_dialog_positive_button, new aguh(this)).setNegativeButton((int) C0126R.string.common_cancel, (DialogInterface.OnClickListener) null).create().show();
                return true;
            } else if (itemId == C0126R.C0129id.support) {
                agrl.m54942a().mo35987a(33, menuItem.getTitle().toString(), "R.id.support", bygd.CLICK_CARRIER_SUPPORT, System.currentTimeMillis(), agvh.m55172b());
                bszh g = agpk.m54726a().mo35847g(agyq.m55288i(getApplicationContext()));
                if (!m67305a(g)) {
                    ((bnsl) f80329e.mo68388c()).mo68405a("Trying to launch support page when there is no support object!");
                    g = m67304a(this);
                }
                FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
                agtr agtr = new agtr();
                agtr.f66513b = new agug();
                agtr.f66512a = g;
                beginTransaction.replace(C0126R.C0129id.carrier_support_page_placeholder, agtr);
                beginTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                beginTransaction.addToBackStack(null);
                beginTransaction.commit();
                getSupportFragmentManager().executePendingTransactions();
                findViewById(C0126R.C0129id.content_layout).setVisibility(8);
                setTitle(getString(C0126R.string.support_menu_item, new Object[]{this.f80332c.mo36104h()}));
                invalidateOptionsMenu();
                return true;
            } else if (itemId != C0126R.C0129id.settings) {
                return super.onOptionsItemSelected(menuItem);
            } else {
                Intent className = new Intent("com.google.android.gms.mobiledataplan.ui.SETTINGS").setClassName(this, "com.google.android.gms.mobiledataplan.ui.MobileDataPlanDetailActivity");
                if (cfmq.m140234e() && agvh.m55172b() != null) {
                    className.putExtra("EventFlowId", agvh.m55172b());
                }
                className.putExtra("ComeFrom", "com.google.android.gms/com.google.android.gms.mobiledataplan.ui.MobileDataPlanSettingsActivity");
                startActivityForResult(className, 2334);
                return true;
            }
        } else {
            onBackPressed();
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        super.onPause();
        if (!cfmq.m140234e() || !this.f80333d) {
            agrl.m54942a().mo35987a(15, (String) null, (String) null, bygd.EXIT_MDP_UI, System.currentTimeMillis(), agvh.m55172b());
        }
        this.f80332c.f66548t = false;
        if (!this.f80333d) {
            f80330f = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009f, code lost:
        if (r5 != p000.bygb.OPT_IN) goto L_0x00db;
     */
    public final boolean onPrepareOptionsMenu(Menu menu) {
        String i = agyq.m55288i(getApplicationContext());
        mo44119h();
        agpk.m54726a().mo35849i(i);
        cflx.m140015b();
        agpk.m54726a().mo35847g(i);
        this.f80332c.mo36104h();
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i2 >= menu.size()) {
                return true;
            }
            MenuItem item = menu.getItem(i2);
            if (item.getTitle() == getString(C0126R.string.stop_syncing_menu_item)) {
                if (mo44119h() || !agpk.m54726a().mo35849i(i) || !agqg.m54865t().booleanValue() || agpk.m54727d()) {
                    z = false;
                }
                item.setVisible(z);
            } else if (item.getTitle() == getString(C0126R.string.support_menu_item)) {
                if (!mo44119h()) {
                    if (!agpk.m54726a().mo35849i(i)) {
                        agpk a = agpk.m54726a();
                        if (agpk.m54727d() && a.mo35843c() != null) {
                            bygb a2 = bygb.m124774a(a.mo35843c().f165204f);
                            if (a2 == null) {
                                a2 = bygb.UNRECOGNIZED;
                            }
                        }
                    }
                    if (cflx.m140015b() && m67305a(agpk.m54726a().mo35847g(i)) && !this.f80332c.mo36104h().isEmpty()) {
                        item.setVisible(true);
                        item.setTitle(String.format(getString(C0126R.string.support_menu_item), this.f80332c.mo36104h()));
                    }
                }
                item.setVisible(false);
            }
            i2++;
        }
    }

    /* access modifiers changed from: protected */
    public final void onRestart() {
        super.onRestart();
        if (f80330f && cfmq.m140246q()) {
            agvh.m55171a();
            f80330f = false;
        }
        mo44116a(false, this.f80334g);
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        if (f80330f && cfmq.m140246q()) {
            agvh.m55171a();
            f80330f = false;
        }
        boolean z = true;
        this.f80332c.f66548t = true;
        this.f80334g = false;
        int i = Build.VERSION.SDK_INT;
        new agrq().mo36032c();
        if (!this.f80333d && !mo44119h()) {
            agtw agtw = this.f80332c;
            if (findViewById(C0126R.C0129id.progress_loader).getVisibility() != 0) {
                z = false;
            }
            agtw.mo36097a(z);
        }
        this.f80333d = false;
    }

    /* renamed from: a */
    private static final boolean m67305a(bszh bszh) {
        if (bszh == null || (bszh.f147824a.isEmpty() && bszh.f147826c.size() == 0)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo44114a(agvf agvf) {
        ImageView imageView;
        ImageView imageView2;
        TextView textView;
        TextView textView2;
        Button button;
        int i;
        Long l;
        agvf agvf2 = agvf;
        invalidateOptionsMenu();
        ViewFlipper viewFlipper = (ViewFlipper) findViewById(C0126R.C0129id.error_screen_flipper);
        if (getResources().getConfiguration().orientation == 2) {
            viewFlipper.setDisplayedChild(1);
        } else {
            viewFlipper.setDisplayedChild(0);
        }
        if (findViewById(C0126R.C0129id.support_channel_page_layout) != null) {
            onBackPressed();
        }
        findViewById(C0126R.C0129id.content_layout).setVisibility(8);
        this.f80336i = agvf2;
        viewFlipper.setVisibility(0);
        this.f80332c.mo36098b(false);
        agvm.m55175a();
        if (getResources().getConfiguration().orientation == 2) {
            button = (Button) findViewById(C0126R.C0129id.refresh_button_landscape);
            textView2 = (TextView) findViewById(C0126R.C0129id.error_title_landscape);
            textView = (TextView) findViewById(C0126R.C0129id.error_description_landscape);
            imageView2 = (ImageView) findViewById(C0126R.C0129id.error_picture_landscape);
            imageView = (ImageView) findViewById(C0126R.C0129id.carrier_logo_landscape);
        } else {
            button = (Button) findViewById(C0126R.C0129id.refresh_button_portrait);
            textView2 = (TextView) findViewById(C0126R.C0129id.error_title_portrait);
            textView = (TextView) findViewById(C0126R.C0129id.error_description_portrait);
            imageView2 = (ImageView) findViewById(C0126R.C0129id.error_picture_portrait);
            imageView = (ImageView) findViewById(C0126R.C0129id.carrier_logo_portrait);
        }
        String h = this.f80332c.mo36104h();
        textView2.setText(getString(agvf2.f66626g, new Object[]{h}));
        if (agvf2 == agvf.OPTED_OUT) {
            textView.setText(Html.fromHtml(getString(agvf2.f66627h, new Object[]{h, cfmj.f184370a.mo6606a().mo81490m(), cfmj.m140162k(), cfmj.m140159h()})));
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            button.setVisibility(0);
            button.setText(agvf2.f66628i);
            button.setOnClickListener(new aguk(this.f80332c));
            agpk a = agpk.m54726a();
            MdpCarrierPlanIdResponse mdpCarrierPlanIdResponse = this.f80332c.f66540l;
            if (mdpCarrierPlanIdResponse != null) {
                l = Long.valueOf(mdpCarrierPlanIdResponse.f80155e);
            } else {
                l = null;
            }
            if (l == null) {
                l = agpk.m54726a().mo35839b(agyq.m55288i(rpr.m34216b()));
            }
            Bitmap a2 = a.mo35824a(l, 2);
            if (a2 != null) {
                imageView.setImageBitmap(a2);
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
            imageView2.setVisibility(8);
            agrl.m54942a().mo35987a(69, (String) null, "R.id.error_layout", bygd.OPT_OUT_PAGE_SHOWN, System.currentTimeMillis(), agvh.m55172b());
            if (cfmq.m140245p()) {
                agrl.m54942a().mo35987a(43, "handledError", (String) null, bygd.FINISH_UI_AFTER_USER_TRIGGER, System.currentTimeMillis(), agvh.m55172b());
                return;
            }
            return;
        }
        int i2 = agvf2.f66627h;
        if (i2 == 0) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            if (!TextUtils.isEmpty(h) || !cfnm.f184575a.mo6606a().mo81670c()) {
                textView.setText(getString(i2, new Object[]{h}));
            } else {
                textView.setText(agvf2.f66630k);
            }
        }
        if (!agvf2.f66631l) {
            i = 8;
        } else {
            i = 0;
        }
        imageView2.setVisibility(i);
        imageView.setVisibility(8);
        int i3 = agvf2.f66628i;
        if (i3 == 0) {
            button.setVisibility(8);
        } else {
            button.setVisibility(0);
            button.setText(i3);
            button.setOnClickListener(new agtv(this.f80332c));
        }
        mo44117e();
        if (cfmq.m140245p()) {
            agrl.m54942a().mo35987a(43, "handledError", (String) null, bygd.FINISH_UI_AFTER_USER_TRIGGER, System.currentTimeMillis(), agvh.m55172b());
        }
    }

    /* renamed from: a */
    public final void mo44115a(Exception exc) {
        agrl.m54942a().mo35987a(14, (String) null, (String) null, bygd.REFRESH_FAILED, System.currentTimeMillis(), agvh.m55172b());
        if (!agqg.m54871z().booleanValue()) {
            ((bnsl) f80329e.mo68388c()).mo68420a("Received exception of type %s while error page is disabled. Exiting.", exc.getClass().getName());
            agtw agtw = this.f80332c;
            agtw.mo36102f();
            Toast.makeText(this, "Couldn't load data plan information", 1).show();
            agrl.m54942a().mo35987a(43, "exitMdpUi", (String) null, bygd.FINISH_UI_AFTER_USER_TRIGGER, System.currentTimeMillis(), agvh.m55172b());
            if (agtw.f66536h.f66571a.isEmpty()) {
                agrl.m54942a().mo35987a(15, "Exit UI due to API failure", (String) null, bygd.EXIT_MDP_UI, System.currentTimeMillis(), agvh.m55172b());
                finish();
                return;
            }
            return;
        }
        agvf a = agvf.m55168a(exc);
        bnsl a2 = f80329e.mo26019b(agyt.m55307c());
        a2.mo68437a(exc);
        a2.mo68420a("Showing error page for error message %s", a);
        agrl.m54942a().mo35987a(25, a.toString(), "R.id.error_layout", bygd.ERROR_PAGE_SHOWN, System.currentTimeMillis(), agvh.m55172b());
        mo44114a(a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo44116a(boolean z, boolean z2) {
        String str;
        int i;
        bygd bygd;
        int i2;
        bygd bygd2;
        agrl a = agrl.m54942a();
        Intent intent = getIntent();
        String action = intent != null ? intent.getAction() : null;
        if (z || z2) {
            if (action != null) {
                if (action.equals("com.google.android.gms.mobiledataplan.NOTIFICATION_TO_ACTIVITY")) {
                    int b = booy.m111408b(intent.getIntExtra("NOTIFICATION_LOGGING_NOTIFICATION_TYPE", 0));
                    int i3 = b - 2;
                    if (b != 0) {
                        if (i3 != 100) {
                            switch (i3) {
                                case 1:
                                    bygd = bygd.PLAN_STATUS_JUMP_TO_UI;
                                    break;
                                case 2:
                                    bygd = bygd.UPSELL_OFFER_JUMP_TO_UI;
                                    break;
                                case 3:
                                    if (!cfnf.m140504e()) {
                                        bygd = bygd.WELCOME_JUMP_TO_UI;
                                        break;
                                    } else {
                                        bygd = bygd.ACCOUNT_ALERT_JUMP_TO_UI;
                                        break;
                                    }
                                case 4:
                                    bygd = bygd.OUT_OF_DATA_JUMP_TO_UI;
                                    break;
                                case 5:
                                    bygd = bygd.EXPIRATION_REMINDER_JUMP_TO_UI;
                                    break;
                                case 6:
                                    bygd = bygd.ACCOUNT_BALANCE_JUMP_TO_UI;
                                    break;
                                case 7:
                                    bygd = bygd.PURCHASE_JUMP_TO_UI;
                                    break;
                                case 8:
                                    bygd = bygd.WELCOME_JUMP_TO_UI;
                                    break;
                                case 9:
                                    bygd = bygd.DAILY_UPDATE_JUMP_TO_UI;
                                    break;
                                case 10:
                                    bygd = bygd.PAYGO_JUMP_TO_UI;
                                    break;
                                default:
                                    bygd = bygd.UNSPECIFIED_EVENT_CODE;
                                    break;
                            }
                        } else {
                            bygd = bygd.OTHER_JUMP_TO_UI;
                        }
                        if (z) {
                            if (intent.getIntExtra("NOTIFICATION_ACTION_INDEX", -1) != -1) {
                                a.mo35990a(intent, boox.NOTIFICATION_ACTION_TAKEN, "MDP_UiAction", bygd.NOTIFICATION_ACTION_TAKEN);
                            }
                            a.mo35990a(intent, boox.JUMP_TO_UI, "MDP_UiAction", bygd);
                        }
                        long longExtra = intent.getLongExtra("NOTIFICATION_LOGGING_NOTIFICATION_ID", 0);
                        if (!z) {
                            i2 = 41;
                        } else {
                            i2 = 17;
                        }
                        String l = Long.toString(longExtra);
                        String l2 = Long.toString(longExtra);
                        Long valueOf = Long.valueOf(longExtra);
                        if (!z) {
                            bygd2 = bygd.REENTER_MDP_UI_VIA_NOTIFICATION;
                        } else {
                            bygd2 = bygd.ENTER_MDP_UI_VIA_NOTIFICATION;
                        }
                        a.mo35988a(i2, l, l2, valueOf, bygd2, System.currentTimeMillis(), agvh.m55172b());
                        return;
                    }
                    throw null;
                } else if (action.equals("com.google.android.gms.mobiledataplan.ui.SETTING_TO_ACTIVITY")) {
                    a.mo35987a(16, (String) null, (String) null, bygd.ENTER_MDP_UI_VIA_MENU, System.currentTimeMillis(), agvh.m55172b());
                    return;
                } else if (action.equals("com.google.android.gms.mobiledataplan.ui.DETAIL_SETTINGS_TO_MAIN")) {
                    a.mo35987a(73, (String) null, (String) null, bygd.ENTER_MDP_UI_VIA_SETTINGS, System.currentTimeMillis(), agvh.m55172b());
                }
            }
            int i4 = Build.VERSION.SDK_INT;
            Uri referrer = getReferrer();
            if (referrer != null) {
                str = referrer.toString();
            } else {
                str = "Unknown Calling Package";
            }
            if (!z) {
                i = 42;
            } else {
                i = 18;
            }
            a.mo35987a(i, str, (String) null, !z ? bygd.REENTER_MDP_UI_VIA_DEEP_LINK : bygd.ENTER_MDP_UI_VIA_DEEP_LINK, System.currentTimeMillis(), agvh.m55172b());
        } else if (!cfmq.m140234e() || !this.f80333d) {
            a.mo35987a(40, (String) null, (String) null, bygd.REENTER_MDP_UI_VIA_APP_PICKER, System.currentTimeMillis(), agvh.m55172b());
        }
    }
}
