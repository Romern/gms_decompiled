package p000;

import android.accounts.Account;
import android.content.ContentResolver;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: amrm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amrm extends Fragment {

    /* renamed from: a */
    private final ancw f75811a = anbx.INSTANCE;

    /* renamed from: b */
    private final Map f75812b = new HashMap();

    /* renamed from: c */
    private Spinner f75813c;

    /* renamed from: a */
    private static final void m63202a(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        sQLiteDatabase.execSQL("DELETE FROM sync_tokens WHERE owner_id = ? AND name = ?", new String[]{str, str2});
    }

    /* renamed from: c */
    public static final Bundle m63204c() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expedited", true);
        bundle.putBoolean("force", true);
        return bundle;
    }

    /* renamed from: b */
    public final void mo41279b() {
        SQLiteDatabase openDatabase = SQLiteDatabase.openDatabase(getContext().getDatabasePath("pluscontacts.db").toString(), null, 0);
        try {
            Iterator it = mo41277a().iterator();
            while (it.hasNext()) {
                Cursor rawQuery = openDatabase.rawQuery("SELECT _id FROM owners WHERE account_name = ?1", new String[]{((Account) it.next()).name});
                ArrayList<String> arrayList = new ArrayList();
                while (rawQuery.moveToNext()) {
                    arrayList.add(Long.toString(rawQuery.getLong(0)));
                }
                rawQuery.close();
                for (String str : arrayList) {
                    m63202a(openDatabase, str, "people");
                    m63202a(openDatabase, str, "gaiamap");
                    m63202a(openDatabase, str, "autocomplete");
                }
            }
            if (openDatabase != null) {
                openDatabase.close();
            }
            List a = mo41277a();
            int size = a.size();
            for (int i = 0; i < size; i++) {
                mo41278a((Account) a.get(i), m63204c());
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.menagerie_settings, viewGroup, false);
        m63203a(inflate, (int) C0126R.C0129id.menagerie_settings_full_sync, new amrf(this));
        m63203a(inflate, (int) C0126R.C0129id.menagerie_settings_periodic_sync, new amrg(this));
        m63203a(inflate, (int) C0126R.C0129id.menagerie_settings_initial_sync, new amrh(this));
        m63203a(inflate, (int) C0126R.C0129id.menagerie_settings_tickle_sync, new amri(this));
        this.f75813c = (Spinner) inflate.findViewById(C0126R.C0129id.menagerie_settings_account_spinner);
        return inflate;
    }

    public final void onResume() {
        super.onResume();
        ArrayAdapter arrayAdapter = new ArrayAdapter(getContext(), 17367048);
        arrayAdapter.setDropDownViewResource(17367049);
        arrayAdapter.add("All Accounts");
        bnrd a = this.f75811a.mo41680d(getContext()).iterator();
        while (a.hasNext()) {
            Account account = (Account) a.next();
            arrayAdapter.add(account.name);
            this.f75812b.put(account.name, account);
        }
        this.f75813c.setAdapter((SpinnerAdapter) arrayAdapter);
    }

    /* renamed from: a */
    private static final void m63203a(View view, int i, Runnable runnable) {
        ((Button) view.findViewById(i)).setOnClickListener(new amrj(runnable));
    }

    /* renamed from: a */
    public final List mo41277a() {
        String str = (String) this.f75813c.getSelectedItem();
        if (str.equals("All Accounts")) {
            return bngx.m109368a(this.f75812b.values());
        }
        if (this.f75812b.containsKey(str)) {
            return bngx.m109356a((Account) this.f75812b.get(str));
        }
        return bngx.m109376e();
    }

    /* renamed from: a */
    public final void mo41278a(Account account, Bundle bundle) {
        try {
            ContentResolver.setSyncAutomatically(account, "com.google.android.gms.people", true);
            ContentResolver.requestSync(account, "com.google.android.gms.people", bundle);
            amrl amrl = new amrl(this, getContext(), account);
            amrl.f75806b = ContentResolver.addStatusChangeListener(4, amrl);
        } catch (Exception e) {
            Log.e("MenagerieDebugSettings", String.format("Request sync (%s) failed", account), e);
            throw e;
        }
    }
}
