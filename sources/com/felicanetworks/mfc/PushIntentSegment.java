package com.felicanetworks.mfc;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.felicanetworks.mfc.util.LogMgr;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PushIntentSegment extends PushSegment {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        /* class com.felicanetworks.mfc.PushIntentSegment.C01191 */

        public PushIntentSegment createFromParcel(Parcel parcel) {
            LogMgr.log(6, "%s", "000");
            LogMgr.log(6, "%s", "999");
            return new PushIntentSegment(parcel);
        }

        public PushIntentSegment[] newArray(int i) {
            LogMgr.log(6, "%s size=%d", "000", Integer.valueOf(i));
            LogMgr.log(6, "%s", "999");
            return new PushIntentSegment[i];
        }
    };
    private Intent intent;

    public PushIntentSegment(Intent intent2) {
        LogMgr.log(4, "%s In intent = %s", "000", intent2);
        if (intent2 != null) {
            this.activateType = 1;
            this.intent = intent2;
            LogMgr.log(4, "%s", "999");
            return;
        }
        LogMgr.log(1, "%s intent == null", "800");
        throw new IllegalArgumentException();
    }

    private void readFromParcel(Parcel parcel) {
        LogMgr.log(6, "%s", "000");
        if (parcel != null) {
            this.activateType = 1;
            this.intent = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
            checkFormat();
            LogMgr.log(6, "%s", "999");
            return;
        }
        LogMgr.log(6, "%s", "700");
        throw new IllegalArgumentException();
    }

    public void checkFormat() {
        LogMgr.log(6, "%s", "000");
        if (this.intent == null) {
            LogMgr.log(1, "%s intent == null", "800");
            throw new IllegalArgumentException();
        } else if (getType() == 1) {
            LogMgr.log(6, "%s", "999");
        } else {
            LogMgr.log(1, "%s activateType != 0x01", "801");
            throw new IllegalArgumentException();
        }
    }

    public int describeContents() {
        LogMgr.log(6, "%s", "000");
        LogMgr.log(6, "%s", "999");
        return 0;
    }

    public Intent getIntentData() {
        LogMgr.log(4, "%s", "000");
        LogMgr.log(4, "%s return = %s", "999", this.intent);
        return this.intent;
    }

    public void setIntentData(Intent intent2) {
        LogMgr.log(4, "%s In intent = %s", "000", intent2);
        if (intent2 != null) {
            this.intent = intent2;
            LogMgr.log(4, "%s", "999");
            return;
        }
        LogMgr.log(1, "%s intent == null", "800");
        throw new IllegalArgumentException();
    }

    public void writeToParcel(Parcel parcel, int i) {
        LogMgr.log(6, "%s", "000");
        parcel.writeParcelable(this.intent, i);
        LogMgr.log(6, "%s", "999");
    }

    private PushIntentSegment(Parcel parcel) {
        LogMgr.log(6, "%s", "000");
        readFromParcel(parcel);
        LogMgr.log(6, "%s", "999");
    }
}
