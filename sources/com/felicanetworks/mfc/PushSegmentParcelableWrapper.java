package com.felicanetworks.mfc;

import android.os.Parcel;
import android.os.Parcelable;
import com.felicanetworks.mfc.util.LogMgr;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PushSegmentParcelableWrapper implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        /* class com.felicanetworks.mfc.PushSegmentParcelableWrapper.C01211 */

        public PushSegmentParcelableWrapper createFromParcel(Parcel parcel) {
            LogMgr.log(6, "%s", "000");
            LogMgr.log(6, "%s", "999");
            return new PushSegmentParcelableWrapper(parcel);
        }

        public PushSegmentParcelableWrapper[] newArray(int i) {
            LogMgr.log(6, "%s", "000");
            LogMgr.log(6, "%s", "999");
            return new PushSegmentParcelableWrapper[i];
        }
    };
    protected PushSegment pushSegment;

    private PushSegmentParcelableWrapper(Parcel parcel) {
        LogMgr.log(6, "%s in", "000");
        PushSegment pushSegment2 = (PushSegment) parcel.readParcelable(PushSegment.class.getClassLoader());
        this.pushSegment = pushSegment2;
        LogMgr.log(6, "%s pushSegment=%s", "999", pushSegment2);
    }

    public int describeContents() {
        LogMgr.log(6, "%s", "000");
        LogMgr.log(6, "%s", "999");
        return 0;
    }

    public PushSegment getPushSegment() {
        LogMgr.log(6, "%s", "000");
        LogMgr.log(6, "%s pushSegment=%s", "999", this.pushSegment);
        return this.pushSegment;
    }

    public void setPushSegment(PushSegment pushSegment2) {
        LogMgr.log(6, "%s pushSegment=%s", "000", pushSegment2);
        this.pushSegment = pushSegment2;
        LogMgr.log(6, "%s", "999");
    }

    public void writeToParcel(Parcel parcel, int i) {
        LogMgr.log(6, "%s dst", "000");
        parcel.writeParcelable(this.pushSegment, i);
        LogMgr.log(6, "%s", "999");
    }

    public PushSegmentParcelableWrapper(PushSegment pushSegment2) {
        LogMgr.log(6, "%s pushSegment=%s", "000", pushSegment2);
        this.pushSegment = pushSegment2;
        LogMgr.log(6, "%s", "999");
    }
}
