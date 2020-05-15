package p000;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;

/* renamed from: abfv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abfv extends aaru {

    /* renamed from: e */
    private final WeakReference f57370e;

    /* renamed from: f */
    private final String f57371f;

    /* renamed from: g */
    private final List f57372g = new ArrayList();

    public abfv(HelpChimeraActivity helpChimeraActivity, String str) {
        super(helpChimeraActivity);
        this.f57370e = new WeakReference(helpChimeraActivity);
        this.f57371f = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo31662b(Object obj) {
        List list = (List) obj;
        HelpChimeraActivity helpChimeraActivity = (HelpChimeraActivity) this.f57370e.get();
        if (helpChimeraActivity != null) {
            ArrayList arrayList = new ArrayList(this.f57372g);
            if (list != null) {
                HelpConfig helpConfig = helpChimeraActivity.f56986y;
                for (int i = 0; i < list.size(); i++) {
                    abfo abfo = (abfo) list.get(i);
                    if (!this.f57372g.contains(abfo) && !(abfo.f57350a == 1 && aasm.m46882a(abfo.f57353d, aasw.m46952a(), helpConfig) == null)) {
                        Context applicationContext = helpChimeraActivity.getApplicationContext();
                        if (abfo.f57350a == 2) {
                            try {
                                if (!new aasq(applicationContext).mo31746a(aasm.m46897b(abfo.f57354e, ""))) {
                                }
                            } catch (JSONException e) {
                            }
                        }
                        arrayList.add(abfo);
                    }
                }
            }
            abfy abfy = helpChimeraActivity.f78964k;
            abfy.f57377c.setAdapter(abfy.f57379e);
            abfu abfu = abfy.f57379e;
            abfu.f57369d = arrayList;
            abfu.mo171aJ();
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Cursor cursor;
        Void[] voidArr = (Void[]) objArr;
        HelpChimeraActivity helpChimeraActivity = (HelpChimeraActivity) this.f57370e.get();
        if (helpChimeraActivity == null) {
            return null;
        }
        HelpConfig helpConfig = helpChimeraActivity.f56986y;
        aatc aatc = helpChimeraActivity.f78966m;
        bqgj bqgj = helpChimeraActivity.f78958e;
        abcr abcr = helpChimeraActivity.f56987z;
        Context applicationContext = helpChimeraActivity.getApplicationContext();
        boolean isEmpty = TextUtils.isEmpty(this.f57371f);
        int i = Build.VERSION.SDK_INT;
        int i2 = Build.VERSION.SDK_INT;
        if (!isEmpty) {
            cursor = aatc.mo31763a(this.f57371f);
        } else {
            cursor = aatc.mo31762a();
        }
        try {
            int columnIndex = cursor.getColumnIndex("suggest_intent_query");
            while (cursor.moveToNext()) {
                this.f57372g.add(new abfo(cursor.getString(columnIndex)));
            }
            if (isEmpty || !helpConfig.mo43233h() || ssk.m36238b(applicationContext)) {
                return null;
            }
            return abfw.m47634a(applicationContext, helpConfig, bqgj, abcr, this.f57371f);
        } finally {
            cursor.close();
        }
    }
}
