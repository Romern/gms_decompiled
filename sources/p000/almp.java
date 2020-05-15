package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.people.internal.MatrixCursorParcelable;
import com.google.android.gms.people.internal.SyncStatus;
import com.google.android.gms.people.protomodel.PersonEntity;

/* renamed from: almp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class almp implements alzm {

    /* renamed from: a */
    final boolean f73781a;

    /* renamed from: b */
    private final alzm f73782b;

    public almp(alzm alzm, boolean z) {
        this.f73782b = alzm;
        this.f73781a = z;
    }

    /* renamed from: a */
    public final void mo40528a(int i, Bundle bundle, Bundle bundle2) {
        this.f73782b.mo40528a(i, bundle, bundle2);
    }

    public final IBinder asBinder() {
        return this.f73782b.asBinder();
    }

    /* renamed from: b */
    public final void mo40537b(int i, SyncStatus syncStatus) {
        this.f73782b.mo40537b(i, syncStatus);
    }

    /* renamed from: a */
    public final void mo40529a(int i, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor) {
        throw new RuntimeException("Shouldn't be called");
    }

    /* renamed from: a */
    public final void mo40530a(int i, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor, Bundle bundle2) {
        if (this.f73781a) {
            this.f73782b.mo40530a(i, bundle, parcelFileDescriptor, bundle2);
        } else {
            this.f73782b.mo40529a(i, bundle, parcelFileDescriptor);
        }
    }

    /* renamed from: a */
    public final void mo40531a(int i, Bundle bundle, DataHolder dataHolder) {
        this.f73782b.mo40531a(i, bundle, dataHolder);
    }

    /* renamed from: a */
    public final void mo40532a(int i, Bundle bundle, DataHolder[] dataHolderArr) {
        this.f73782b.mo40532a(i, bundle, dataHolderArr);
    }

    /* renamed from: a */
    public final void mo40533a(int i, MatrixCursorParcelable matrixCursorParcelable) {
        this.f73782b.mo40533a(i, matrixCursorParcelable);
    }

    /* renamed from: a */
    public final void mo40494a(int i, SyncStatus syncStatus) {
        this.f73782b.mo40494a(i, syncStatus);
    }

    /* renamed from: a */
    public final void mo40534a(int i, PersonEntity personEntity) {
        this.f73782b.mo40534a(i, personEntity);
    }

    /* renamed from: a */
    public final void mo40535a(int i, String str) {
        this.f73782b.mo40535a(i, str);
    }
}
