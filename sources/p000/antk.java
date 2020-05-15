package p000;

import android.os.Bundle;
import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.server.response.SafeParcelResponse;
import com.google.android.gms.plus.internal.model.people.PersonEntity;

/* renamed from: antk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface antk extends IInterface {
    /* renamed from: a */
    void mo42229a(int i, Bundle bundle);

    /* renamed from: a */
    void mo42230a(int i, Bundle bundle, Bundle bundle2);

    /* renamed from: a */
    void mo42231a(int i, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor);

    /* renamed from: a */
    void mo42232a(int i, Bundle bundle, SafeParcelResponse safeParcelResponse);

    /* renamed from: a */
    void mo42233a(int i, PersonEntity personEntity);

    /* renamed from: a */
    void mo42234a(Status status);

    /* renamed from: a */
    void mo42235a(DataHolder dataHolder, String str);

    /* renamed from: a */
    void mo42236a(DataHolder dataHolder, String str, String str2);
}
