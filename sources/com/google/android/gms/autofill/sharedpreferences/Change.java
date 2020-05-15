package com.google.android.gms.autofill.sharedpreferences;

import android.content.SharedPreferences;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class Change implements Parcelable {
    public static final Parcelable.Creator CREATOR = new lhp();

    /* renamed from: a */
    public final boolean f11677a;

    /* renamed from: b */
    public final Put[] f11678b;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class Put implements Parcelable {
        public static final Parcelable.Creator CREATOR = new lhq();

        /* renamed from: a */
        public final String f11679a;

        /* renamed from: b */
        public final Object f11680b;

        public Put(String str, Object obj) {
            this.f11679a = str;
            this.f11680b = obj;
        }

        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return String.format("%s=%s", this.f11679a, this.f11680b);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f11679a);
            Object obj = this.f11680b;
            if (obj == null) {
                parcel.writeByte((byte) 1);
            } else if (obj instanceof Boolean) {
                parcel.writeByte((byte) 2);
                parcel.writeByte(((Boolean) this.f11680b).booleanValue() ? (byte) 1 : 0);
            } else if (obj instanceof Float) {
                parcel.writeByte((byte) 3);
                parcel.writeFloat(((Float) this.f11680b).floatValue());
            } else if (obj instanceof Integer) {
                parcel.writeByte((byte) 4);
                parcel.writeInt(((Integer) this.f11680b).intValue());
            } else if (obj instanceof Long) {
                parcel.writeByte((byte) 5);
                parcel.writeLong(((Long) this.f11680b).longValue());
            } else if (obj instanceof String) {
                parcel.writeByte((byte) 6);
                parcel.writeString((String) this.f11680b);
            } else if (obj instanceof Set) {
                parcel.writeByte((byte) 7);
                parcel.writeStringArray((String[]) ((Set) this.f11680b).toArray(new String[0]));
            } else {
                throw new UnsupportedOperationException();
            }
        }
    }

    public Change(boolean z, Put[] putArr) {
        this.f11677a = z;
        this.f11678b = putArr;
    }

    /* renamed from: a */
    public static Change m7175a(Map map) {
        Put[] putArr = new Put[map.size()];
        int i = 0;
        for (Map.Entry entry : map.entrySet()) {
            putArr[i] = new Put((String) entry.getKey(), entry.getValue());
            i++;
        }
        return new Change(true, putArr);
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return String.format("Change[clear=%s, puts=%s]", Boolean.valueOf(this.f11677a), Arrays.toString(this.f11678b));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f11677a ? (byte) 1 : 0);
        parcel.writeTypedArray(this.f11678b, i);
    }

    /* renamed from: a */
    public final void mo7989a(SharedPreferences.Editor editor) {
        if (this.f11677a) {
            editor.clear();
        }
        Put[] putArr = this.f11678b;
        for (Put put : putArr) {
            Object obj = put.f11680b;
            if (obj == null) {
                editor.remove(put.f11679a);
            } else if (obj instanceof Boolean) {
                editor.putBoolean(put.f11679a, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Float) {
                editor.putFloat(put.f11679a, ((Float) obj).floatValue());
            } else if (obj instanceof Integer) {
                editor.putInt(put.f11679a, ((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                editor.putLong(put.f11679a, ((Long) obj).longValue());
            } else if (obj instanceof String) {
                editor.putString(put.f11679a, (String) obj);
            } else if (obj instanceof Set) {
                editor.putStringSet(put.f11679a, (Set) obj);
            }
        }
        editor.apply();
    }
}
