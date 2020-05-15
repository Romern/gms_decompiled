package com.google.android.gms.plus.apps;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.plus.internal.model.apps.ApplicationEntity;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ListAppsChimeraActivity extends deu {

    /* renamed from: b */
    private anme f82226b;

    /* renamed from: c */
    private final ArrayList f82227c = new ArrayList();

    /* renamed from: d */
    private anmf f82228d;

    /* renamed from: a */
    private final void m68297a(anmf anmf) {
        if (anmf.getTag() == "connected_apps") {
            findViewById(C0126R.C0129id.filters_spinner_view).setVisibility(0);
        } else {
            findViewById(C0126R.C0129id.filters_spinner_view).setVisibility(8);
        }
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.show(anmf);
        anmf anmf2 = this.f82228d;
        if (!(anmf2 == null || anmf2 == anmf)) {
            beginTransaction.hide(anmf2);
        }
        beginTransaction.setTransition(0);
        beginTransaction.commit();
        anmf.mo41941a(mo8628aW());
        this.f82228d = anmf;
    }

    /* renamed from: aX */
    public final boolean mo8629aX() {
        finish();
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        String stringExtra;
        if (i != 1) {
            if (i == 2) {
                this.f82226b.f77108b = i2;
            } else if (i != 3) {
                super.onActivityResult(i, i2, intent);
            } else if (i2 == -1) {
                String stringExtra2 = intent.getStringExtra("deleted_moment_id");
                annx annx = (annx) getSupportFragmentManager().findFragmentByTag("activity_log");
                if (stringExtra2 != null && annx != null) {
                    annx.f77245b.add(stringExtra2);
                    if (annx.getListAdapter() != null) {
                        annr d = annx.getListAdapter();
                        ArrayList arrayList = ((annx) d.f77217a).f77245b;
                        Iterator it = d.f77218b.iterator();
                        boolean z = false;
                        while (it.hasNext()) {
                            if (arrayList.contains(((aohj) it.next()).mo42748f())) {
                                it.remove();
                                z = true;
                            }
                        }
                        if (z) {
                            d.notifyDataSetChanged();
                        }
                    }
                }
            }
        } else if (i2 == -1 && (stringExtra = intent.getStringExtra("com.google.android.gms.plus.DISCONNECTED_APP_ID")) != null) {
            this.f82226b.f77111e.add(stringExtra);
            this.f82228d.mo41941a(mo8628aW());
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    public final void onCreate(Bundle bundle) {
        Intent intent;
        String str;
        FavaDiagnosticsEntity favaDiagnosticsEntity;
        FavaDiagnosticsEntity favaDiagnosticsEntity2;
        anmf anmf;
        String str2;
        String str3;
        String str4;
        anmf anmf2;
        int i;
        Bundle bundle2 = bundle;
        super.onCreate(bundle);
        if (soz.m35807f(this)) {
            Log.w("AppSettings", "This activity is not available for restricted profile.");
            setResult(0);
            finish();
            return;
        }
        Intent intent2 = getIntent();
        boolean equals = "com.google.android.gms.plus.action.VIEW_ACTIVITY_LOG".equals(intent2.getAction());
        String stringExtra = intent2.getStringExtra("com.google.android.gms.extras.ACCOUNT_NAME");
        if (stringExtra == null) {
            if (!equals || (!intent2.hasExtra("com.google.android.gms.extras.APP_ID") && !intent2.hasExtra("application"))) {
                stringExtra = anme.m64738b(this);
            }
            if (stringExtra == null) {
                Log.w("AppSettings", "This activity is requires an account name.");
                setResult(0);
                finish();
                return;
            }
        }
        setContentView((int) C0126R.C0128layout.plus_list_apps_activity);
        findViewById(C0126R.C0129id.empty_view).setVisibility(8);
        mo8628aW().mo15841a(20, 28);
        String a = spn.m35852a((Activity) this);
        if (a == null) {
            a = getPackageName();
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        anme anme = (anme) supportFragmentManager.findFragmentByTag("apps_util");
        this.f82226b = anme;
        if (anme == null) {
            Bundle bundle3 = new Bundle();
            bundle3.putString("account_name", stringExtra);
            bundle3.putString("calling_package_name", a);
            anme anme2 = new anme();
            anme2.setArguments(bundle3);
            this.f82226b = anme2;
            anme2.setRetainInstance(true);
            supportFragmentManager.beginTransaction().add(this.f82226b, "apps_util").commit();
        }
        boolean b = rfz.m33557a(this).mo24610b(a);
        FragmentManager supportFragmentManager2 = getSupportFragmentManager();
        FragmentTransaction beginTransaction = supportFragmentManager2.beginTransaction();
        beginTransaction.setTransition(0);
        Intent intent3 = getIntent();
        String stringExtra2 = intent3.getStringExtra("com.google.android.gms.extras.APP_ID");
        ApplicationEntity applicationEntity = (ApplicationEntity) intent3.getParcelableExtra("application");
        String str5 = "activity_log";
        if (b) {
            str = stringExtra;
            str2 = intent3.getStringExtra("com.google.android.gms.extras.COLLECTION_FILTER");
            if (!(stringExtra2 == null || str2 == null)) {
                if (Log.isLoggable("AppSettings", 5)) {
                    Log.w("AppSettings", "EXTRA_APP_ID and EXTRA_COLLECTION_FILTER filters for Activity Log are mutually exclusive.");
                }
                setResult(0);
                finish();
                intent = intent2;
                if (bundle2 == null) {
                    str5 = bundle2.getString("selected_page_tag");
                    favaDiagnosticsEntity2 = null;
                    favaDiagnosticsEntity = null;
                } else if (equals) {
                    FavaDiagnosticsEntity favaDiagnosticsEntity3 = rih.f43053g;
                    if (!getPackageName().equals(a)) {
                        favaDiagnosticsEntity = favaDiagnosticsEntity3;
                        favaDiagnosticsEntity2 = anlm.f77058b;
                    } else {
                        favaDiagnosticsEntity = favaDiagnosticsEntity3;
                        favaDiagnosticsEntity2 = null;
                    }
                } else if (intent.getBooleanExtra("com.google.android.gms.extras.ALL_APPS", false)) {
                    FavaDiagnosticsEntity favaDiagnosticsEntity4 = rih.f43050d;
                    favaDiagnosticsEntity = rih.f43056j;
                    str5 = "connected_apps";
                    favaDiagnosticsEntity2 = favaDiagnosticsEntity4;
                } else {
                    FavaDiagnosticsEntity favaDiagnosticsEntity5 = anlm.f77057a;
                    favaDiagnosticsEntity = rih.f43048b;
                    str5 = "connected_apps";
                    favaDiagnosticsEntity2 = favaDiagnosticsEntity5;
                }
                if (this.f82227c.size() <= 0) {
                    int i2 = 0;
                    anmf anmf3 = (anmf) this.f82227c.get(0);
                    ArrayList arrayList = this.f82227c;
                    int size = arrayList.size();
                    while (true) {
                        if (i2 >= size) {
                            anmf = anmf3;
                            break;
                        }
                        anmf = (anmf) arrayList.get(i2);
                        i2++;
                        if (anmf.getTag().equals(str5)) {
                            break;
                        }
                    }
                    if (favaDiagnosticsEntity2 != null) {
                        shz.m35337a(this, str, rig.f43037e, favaDiagnosticsEntity2, favaDiagnosticsEntity, a);
                    }
                    m68297a(anmf);
                    return;
                }
                return;
            }
        } else {
            str = stringExtra;
            str2 = null;
        }
        if (equals && !(stringExtra2 == null && applicationEntity == null && str2 == null)) {
            intent = intent2;
        } else {
            anmf anmf4 = (anmf) supportFragmentManager2.findFragmentByTag("connected_apps");
            if (anmf4 == null) {
                intent = intent2;
                int intExtra = intent3.getIntExtra("com.google.android.gms.extras.PRESELECTED_FILTER", -1);
                if (intExtra != -1) {
                    i = intExtra;
                } else if (intent3.getBooleanExtra("com.google.android.gms.extras.ALL_APPS", false)) {
                    i = 0;
                } else {
                    i = 1;
                }
                anmf2 = anmo.m64769b(i);
                beginTransaction.add(C0126R.C0129id.fragment_container, anmf2, "connected_apps");
            } else {
                intent = intent2;
                anmf2 = anmf4;
            }
            beginTransaction.hide(anmf2);
            this.f82227c.add(anmf2);
        }
        anmf anmf5 = (anmf) supportFragmentManager2.findFragmentByTag(str5);
        if (anmf5 == null) {
            if (applicationEntity == null) {
                if (b) {
                    str4 = intent3.getStringExtra("com.google.android.gms.extras.APP_NAME");
                    str3 = intent3.getStringExtra("com.google.android.gms.extras.APP_ICON_URL");
                } else {
                    str4 = null;
                    str3 = null;
                }
                if (stringExtra2 != null) {
                    applicationEntity = new ApplicationEntity(str4, str3, stringExtra2);
                }
            }
            Bundle bundle4 = new Bundle();
            if (applicationEntity != null) {
                bundle4.putParcelable("app_filter", applicationEntity);
            } else if (str2 != null) {
                bundle4.putString("collection_filter", str2);
            }
            annx annx = new annx();
            annx.setArguments(bundle4);
            beginTransaction.add(C0126R.C0129id.fragment_container, annx, str5);
            anmf5 = annx;
        }
        beginTransaction.hide(anmf5);
        this.f82227c.add(anmf5);
        beginTransaction.commit();
        if (bundle2 == null) {
        }
        if (this.f82227c.size() <= 0) {
        }
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        this.f82228d.onPrepareOptionsMenu(menu);
        for (int i = 0; i < this.f82227c.size(); i++) {
            if (((anmf) this.f82227c.get(i)) != this.f82228d) {
                int i2 = Build.VERSION.SDK_INT;
            }
        }
        return super.onCreateOptionsMenu(menu);
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        super.onDestroy();
        anme anme = this.f82226b;
        if (anme == null) {
            return;
        }
        if (anme.f77118l.mo24805i() || anme.f77118l.mo24806j()) {
            anme.f77118l.mo24803g();
        }
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() < this.f82227c.size()) {
            anmf anmf = (anmf) this.f82227c.get(menuItem.getItemId());
            anmf anmf2 = this.f82228d;
            if (anmf != anmf2) {
                this.f82226b.mo41934a(anmf2.mo41944c(), anmf.mo41944c());
                m68297a(anmf);
                supportInvalidateOptionsMenu();
            }
            return true;
        } else if (this.f82228d.onOptionsItemSelected(menuItem) || super.onOptionsItemSelected(menuItem)) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("selected_page_tag", this.f82228d.getTag());
    }
}
