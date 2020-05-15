package p000;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import com.google.android.gms.common.people.data.Audience;
import com.google.android.gms.common.people.data.AudienceMember;

/* renamed from: rqo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rqo extends rqi {

    /* renamed from: a */
    private Audience f43522a;

    /* renamed from: b */
    private TextView f43523b;

    public final vzr getView() {
        return vzs.m41642a(this.f43523b);
    }

    public final void initialize(vzr vzr, vzr vzr2, rqm rqm) {
        this.f43523b = new TextView((Context) vzs.m41641a(vzr));
    }

    public final void onRestoreInstanceState(Bundle bundle) {
        setAudience((Audience) bundle.getParcelable("audience"));
    }

    public final Bundle onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("audience", this.f43522a);
        return bundle;
    }

    public final void setAudience(Audience audience) {
        this.f43522a = audience;
        if (audience != null) {
            String str = null;
            for (AudienceMember audienceMember : audience.f30287b) {
                String valueOf = String.valueOf(str != null ? String.valueOf(str).concat(", ") : "");
                String valueOf2 = String.valueOf(audienceMember.f30296f);
                str = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
            }
            this.f43523b.setText(str);
            return;
        }
        this.f43523b.setText("");
    }

    public final void setEditMode(int i) {
    }

    public final void setIsUnderageAccount(boolean z) {
    }

    public final void setShowEmptyText(boolean z) {
    }
}
