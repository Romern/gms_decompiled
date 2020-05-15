package p000;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.romanesco.protomodel.RestoreInfoEntity;
import java.util.ArrayList;

/* renamed from: apew */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apew extends aaab {

    /* renamed from: a */
    private final aoyh f84269a = aoyh.m69805a("FetchRestoreInfoOps");

    /* renamed from: b */
    private final apbn f84270b;

    /* renamed from: c */
    private final String f84271c;

    public apew(apbn apbn, String str) {
        super(135, "FetchRestoreInfoOps");
        this.f84270b = apbn;
        this.f84271c = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        SharedPreferences a = apet.m70117a(context);
        ArrayList arrayList = new ArrayList();
        for (String str : a.getAll().keySet()) {
            if (str.startsWith("last_restore_time:")) {
                String replaceFirst = str.replaceFirst("last_restore_time:", "");
                if (replaceFirst.matches("^[A-Fa-f0-9]+$")) {
                    arrayList.add(new RestoreInfoEntity(replaceFirst, Long.valueOf(a.getLong(str, 0))));
                }
            }
        }
        this.f84269a.mo46979a("Number of backups info returned for account %s: %d", this.f84271c, Integer.valueOf(arrayList.size()));
        this.f84270b.mo46971d(Status.f30107a, arrayList);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f84270b.mo46971d(status, null);
    }
}
