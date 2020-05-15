package p000;

import android.os.IInterface;
import com.google.android.gms.common.people.data.AudienceMember;

/* renamed from: ante */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface ante extends IInterface {
    void configure(String str, String str2, AudienceMember audienceMember, String str3, antg antg);

    vzr getView();

    void initialize(vzr vzr, vzr vzr2, vzr vzr3);

    void refreshButton();

    void setAnalyticsStartView(String str, int i);

    void setShowProgressIndicator(boolean z);

    void setSize(int i);

    void setType(int i);
}
