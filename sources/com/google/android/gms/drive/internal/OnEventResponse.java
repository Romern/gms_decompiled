package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.events.ChangeEvent;
import com.google.android.gms.drive.events.ChangesAvailableEvent;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.drive.events.DriveEvent;
import com.google.android.gms.drive.events.QueryResultEventParcelable;
import com.google.android.gms.drive.events.TransferProgressEvent;
import com.google.android.gms.drive.events.TransferStateEvent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OnEventResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new uuc();

    /* renamed from: a */
    final int f30881a;

    /* renamed from: b */
    final ChangeEvent f30882b;

    /* renamed from: c */
    final CompletionEvent f30883c;

    /* renamed from: d */
    final QueryResultEventParcelable f30884d;

    /* renamed from: e */
    final ChangesAvailableEvent f30885e;

    /* renamed from: f */
    final TransferStateEvent f30886f;

    /* renamed from: g */
    final TransferProgressEvent f30887g;

    public OnEventResponse(int i, ChangeEvent changeEvent, CompletionEvent completionEvent, QueryResultEventParcelable queryResultEventParcelable, ChangesAvailableEvent changesAvailableEvent, TransferStateEvent transferStateEvent, TransferProgressEvent transferProgressEvent) {
        this.f30881a = i;
        this.f30882b = changeEvent;
        this.f30883c = completionEvent;
        this.f30884d = queryResultEventParcelable;
        this.f30885e = changesAvailableEvent;
        this.f30886f = transferStateEvent;
        this.f30887g = transferProgressEvent;
    }

    /* renamed from: a */
    public final DriveEvent mo18206a() {
        int i = this.f30881a;
        if (i == 1) {
            return this.f30882b;
        }
        if (i == 2) {
            return this.f30883c;
        }
        if (i == 3) {
            return this.f30884d;
        }
        if (i == 4) {
            return this.f30885e;
        }
        if (i == 7) {
            return this.f30886f;
        }
        if (i == 8) {
            return this.f30887g;
        }
        StringBuilder sb = new StringBuilder(33);
        sb.append("Unexpected event type ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public OnEventResponse(DriveEvent driveEvent) {
        int a = driveEvent.mo18144a();
        this.f30881a = a;
        if (a == 1) {
            this.f30882b = (ChangeEvent) driveEvent;
            this.f30883c = null;
            this.f30884d = null;
            this.f30885e = null;
            this.f30886f = null;
            this.f30887g = null;
        } else if (a == 2) {
            this.f30882b = null;
            this.f30883c = (CompletionEvent) driveEvent;
            this.f30884d = null;
            this.f30885e = null;
            this.f30886f = null;
            this.f30887g = null;
        } else if (a == 3) {
            this.f30882b = null;
            this.f30883c = null;
            this.f30884d = (QueryResultEventParcelable) driveEvent;
            this.f30885e = null;
            this.f30886f = null;
            this.f30887g = null;
        } else if (a == 4) {
            this.f30882b = null;
            this.f30883c = null;
            this.f30884d = null;
            this.f30885e = (ChangesAvailableEvent) driveEvent;
            this.f30886f = null;
            this.f30887g = null;
        } else if (a == 7) {
            this.f30882b = null;
            this.f30883c = null;
            this.f30884d = null;
            this.f30885e = null;
            this.f30886f = (TransferStateEvent) driveEvent;
            this.f30887g = null;
        } else if (a == 8) {
            this.f30882b = null;
            this.f30883c = null;
            this.f30884d = null;
            this.f30885e = null;
            this.f30886f = null;
            this.f30887g = (TransferProgressEvent) driveEvent;
        } else {
            StringBuilder sb = new StringBuilder(33);
            sb.append("Unexpected event type ");
            sb.append(a);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 2, this.f30881a);
        see.m35040a(parcel, 3, this.f30882b, i, false);
        see.m35040a(parcel, 5, this.f30883c, i, false);
        see.m35040a(parcel, 6, this.f30884d, i, false);
        see.m35040a(parcel, 7, this.f30885e, i, false);
        see.m35040a(parcel, 9, this.f30886f, i, false);
        see.m35040a(parcel, 10, this.f30887g, i, false);
        see.m35062b(parcel, a);
    }
}
