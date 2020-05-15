package p000;

import android.accounts.Account;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.plus.internal.model.apps.ApplicationEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.MomentEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.MomentsFeed;
import java.util.ArrayList;
import java.util.List;

/* renamed from: annx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class annx extends anmf implements LoaderManager.LoaderCallbacks, AdapterView.OnItemClickListener, AdapterView.OnItemSelectedListener, DialogInterface.OnClickListener, annq, annv, annz {

    /* renamed from: b */
    public final ArrayList f77245b = new ArrayList();

    /* renamed from: c */
    public annw f77246c;

    /* renamed from: d */
    public annt f77247d;

    /* renamed from: e */
    private ApplicationEntity f77248e;

    /* renamed from: f */
    private String f77249f;

    /* renamed from: g */
    private CharSequence f77250g;

    /* renamed from: h */
    private String f77251h;

    /* renamed from: i */
    private String f77252i;

    /* renamed from: j */
    private aonj f77253j;

    /* renamed from: k */
    private anoa f77254k;

    /* renamed from: e */
    private final void m64839e() {
        anna.m64797a();
        if (!anna.m64798b(getActivity(), 2)) {
            if (getListAdapter() != null) {
                annr d = getListAdapter();
                d.f77218b.clear();
                d.f77219c = false;
                d.notifyDataSetChanged();
            }
            this.f77251h = ((anmf) this).f77123a.f77107a.name;
            this.f77252i = null;
            setListShown(false);
            getLoaderManager().restartLoader(BaseMfiEventCallback.TYPE_UNKNOWN_ERROR, null, this);
        }
    }

    /* renamed from: f */
    private final void m64840f() {
        if (getListAdapter() != null) {
            annr d = getListAdapter();
            d.f77218b.clear();
            d.f77219c = false;
            d.notifyDataSetInvalidated();
        }
        anna.m64797a();
        if (anna.m64798b(getActivity(), 2)) {
            anna.m64797a();
            setEmptyText(anna.m64796a(getActivity(), 2));
        } else {
            setEmptyText(getString(C0126R.string.plus_list_moments_error));
        }
        setListShown(true);
    }

    /* renamed from: a */
    public final void mo41930a() {
    }

    /* renamed from: b */
    public final void mo41943b(C1341rz rzVar) {
        rzVar.mo15850b((int) C0126R.C0127drawable.plus_icon_red_32);
        String str = ((anmf) this).f77123a.f77107a.name;
        if (this.f77248e == null && this.f77249f == null) {
            String[] a = anme.m64736a(getActivity());
            if (this.f77253j == null) {
                aonj aonj = new aonj(rzVar.mo15868g(), a);
                this.f77253j = aonj;
                aonj.f78572a = aonj.getContext().getResources().getString(C0126R.string.plus_app_settings_activity_log_page_label);
                aonj.notifyDataSetChanged();
            }
            rzVar.mo15840a((int) C0126R.C0128layout.common_action_bar_spinner);
            Spinner spinner = (Spinner) rzVar.mo15837a().findViewById(C0126R.C0129id.action_bar_spinner);
            spinner.setOnItemSelectedListener(this);
            spinner.setAdapter((SpinnerAdapter) this.f77253j);
            spinner.setVisibility(0);
            spinner.setSelection(this.f77253j.getPosition(str));
            if (a.length == 1) {
                spinner.setBackgroundResource(0);
                spinner.setClickable(false);
            }
        } else {
            rzVar.mo15840a((int) C0126R.C0128layout.plus_settings_action_bar_title_sub_title);
            ((TextView) rzVar.mo15837a().findViewById(C0126R.C0129id.title)).setText((int) C0126R.string.plus_app_settings_activity_log_page_label);
            int i = Build.VERSION.SDK_INT;
        }
        if (!str.equals(this.f77251h)) {
            m64839e();
        }
    }

    /* renamed from: c */
    public final FavaDiagnosticsEntity mo41944c() {
        return rih.f43053g;
    }

    /* renamed from: d */
    public final annr getListAdapter() {
        return (annr) super.getListAdapter();
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        mo41942b();
        getListView().setOnItemClickListener(this);
        if (bundle == null || !bundle.containsKey("moment_list_app_filter")) {
            this.f77248e = (ApplicationEntity) getArguments().getParcelable("app_filter");
        } else {
            this.f77248e = (ApplicationEntity) bundle.getParcelable("moment_list_app_filter");
        }
        this.f77249f = getArguments().getString("collection_filter");
        this.f77246c = annw.m64835a(getActivity());
        this.f77247d = annt.m64831a(getActivity());
        this.f77246c.mo42016a(this);
        ApplicationEntity applicationEntity = this.f77248e;
        int i = C0126R.string.plus_list_moments_filter_empty_message;
        if (applicationEntity == null && this.f77249f == null) {
            i = C0126R.string.plus_list_moments_empty_message;
        }
        this.f77250g = getText(i);
        if (bundle != null && bundle.containsKey("moment_list_deleted_moments")) {
            this.f77245b.clear();
            this.f77245b.addAll(bundle.getStringArrayList("moment_list_deleted_moments"));
        }
        anna.m64797a();
        if (!anna.m64798b(getActivity(), 2)) {
            ApplicationEntity applicationEntity2 = this.f77248e;
            if (applicationEntity2 != null && applicationEntity2.f82380b == null) {
                anoa a = anoa.m64848a(getActivity());
                this.f77254k = a;
                a.mo42027a(this, this.f77248e.f82382d, anme.m64738b(getActivity()));
                return;
            }
            return;
        }
        m64840f();
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        String str;
        if (i == 200) {
            Activity activity = getActivity();
            Account account = ((anmf) this).f77123a.f77107a;
            String str2 = this.f77249f;
            ApplicationEntity applicationEntity = this.f77248e;
            if (applicationEntity != null) {
                str = applicationEntity.f82382d;
            } else {
                str = null;
            }
            return new anns(activity, account, str2, str, ((Integer) ansx.f77704z.mo25081c()).intValue(), this.f77252i);
        }
        StringBuilder sb = new StringBuilder(30);
        sb.append("Unknown loader ID: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f77246c.mo42018b(this);
        anoa anoa = this.f77254k;
        if (anoa != null) {
            anoa.mo42026a(this);
        }
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        aohj a = getListAdapter().getItem(i);
        if (a != null) {
            Intent intent = new Intent();
            intent.setClassName(getActivity(), "com.google.android.gms.plus.apps.ManageMomentActivity");
            intent.putExtra("account", ((anmf) this).f77123a.f77107a);
            intent.putExtra("app_activity", (MomentEntity) a);
            ApplicationEntity applicationEntity = this.f77248e;
            if (applicationEntity == null) {
                ArrayList arrayList = ((anmf) this).f77123a.f77110d;
                int size = arrayList.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    anxl anxl = (anxl) arrayList.get(i2);
                    i2++;
                    if (anxl.mo42353c().equals(a.mo42746c())) {
                        applicationEntity = ApplicationEntity.m68424a(anxl);
                        break;
                    }
                }
            }
            intent.putExtra("application", applicationEntity);
            getActivity().startActivityForResult(intent, 3);
            ((anmf) this).f77123a.mo41934a(rih.f43053g, rih.f43054h);
        }
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        String str = (String) this.f77253j.getItem(i);
        if (!str.equals(((anmf) this).f77123a.f77107a.name)) {
            ((anmf) this).f77123a.mo41939b(str);
            if (!str.equals(this.f77251h)) {
                m64839e();
            }
        }
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        MomentsFeed momentsFeed = (MomentsFeed) obj;
        if (loader.getId() == 200) {
            boolean z = true;
            setListShown(true);
            ConnectionResult connectionResult = ((anns) loader).f77221a;
            if (getListAdapter() == null) {
                setListAdapter(new annr(getActivity(), this));
            }
            if (momentsFeed == null || connectionResult == null || !connectionResult.mo17671b()) {
                getLoaderManager().destroyLoader(BaseMfiEventCallback.TYPE_UNKNOWN_ERROR);
                m64840f();
                return;
            }
            setEmptyText(this.f77250g);
            this.f77252i = momentsFeed.f82981d;
            annr d = getListAdapter();
            List list = momentsFeed.f82980c;
            if (this.f77252i == null) {
                z = false;
            }
            d.f77219c = z;
            ArrayList arrayList = ((annx) d.f77217a).f77245b;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                aohj aohj = (aohj) list.get(i);
                if (!arrayList.contains(aohj.mo42748f())) {
                    ArrayList arrayList2 = d.f77218b;
                    aohj.mo7556bF();
                    arrayList2.add(aohj);
                }
            }
            d.notifyDataSetChanged();
        }
    }

    public final void onLoaderReset(Loader loader) {
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 200) {
            return super.onOptionsItemSelected(menuItem);
        }
        Intent data = new Intent("android.intent.action.VIEW").setData(Uri.parse((String) ansx.f77701w.mo25081c()));
        if (!spn.m35860a(getActivity(), data)) {
            rid.m33629a(getActivity(), data, 0);
            return true;
        }
        startActivity(data);
        return true;
    }

    public final void onPrepareOptionsMenu(Menu menu) {
        super.onPrepareOptionsMenu(menu);
        menu.add(0, (int) BaseMfiEventCallback.TYPE_UNKNOWN_ERROR, 100, (int) C0126R.string.common_list_apps_menu_help);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("moment_list_app_filter", this.f77248e);
        bundle.putStringArrayList("moment_list_deleted_moments", this.f77245b);
    }

    /* renamed from: a */
    public final void mo42020a(anny anny) {
        if (anny.f77255a.equals(this.f77248e.f82382d)) {
            this.f77248e = new ApplicationEntity(anny.f77256b, anny.f77257c, anny.f77255a);
        }
    }

    /* renamed from: a */
    public final void mo42015a(String str, Drawable drawable) {
        if (drawable != null) {
            this.f77247d.mo42013a(str, drawable);
            if (getListAdapter() != null) {
                getListAdapter().notifyDataSetChanged();
            }
        }
    }
}
