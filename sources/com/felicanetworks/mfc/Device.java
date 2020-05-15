package com.felicanetworks.mfc;

import android.os.Parcel;
import android.os.Parcelable;
import com.felicanetworks.mfc.util.LogMgr;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class Device implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        /* class com.felicanetworks.mfc.Device.C00981 */

        public Device createFromParcel(Parcel parcel) {
            return new Device(parcel);
        }

        public Device[] newArray(int i) {
            return new Device[i];
        }
    };
    private static final String ENCODING = "ISO-8859-1";
    private static final String EXC_INVALID_PARAMETER = "The specified type/name is null or contains an invalid character, otherwise the length is out of range.";
    private static final int MAX_CHAR = 126;
    private static final int MAX_LENGTH = 255;
    private static final int MIN_CHAR = 33;
    private static final int MIN_LENGTH = 1;
    private String name;
    private String type;

    private Device(Parcel parcel) {
        readFromParcel(parcel);
    }

    private void checkString(String str) {
        try {
            ByteBuffer encode = Charset.forName(ENCODING).newEncoder().encode(CharBuffer.wrap(str));
            int limit = encode.limit();
            byte[] bArr = new byte[limit];
            encode.get(bArr);
            if (limit <= 0 || limit > MAX_LENGTH) {
                throw new IllegalArgumentException(EXC_INVALID_PARAMETER);
            }
            for (int i = 0; i < limit; i++) {
                byte b = bArr[i] & MAX_LENGTH;
                if (b < 33 || b > MAX_CHAR) {
                    throw new IllegalArgumentException(EXC_INVALID_PARAMETER);
                }
            }
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (Exception e2) {
            throw new IllegalArgumentException(EXC_INVALID_PARAMETER);
        }
    }

    private void readFromParcel(Parcel parcel) {
        this.type = parcel.readString();
        this.name = parcel.readString();
    }

    private void setName(String str) {
        checkString(str);
        this.name = str;
    }

    private void setType(String str) {
        checkString(str);
        this.type = str;
    }

    public void checkFormat() {
        LogMgr.log(4, "%s", "000");
        checkString(this.type);
        checkString(this.name);
        LogMgr.log(4, "%s", "999");
    }

    public int describeContents() {
        return 0;
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.type);
        parcel.writeString(this.name);
    }

    public Device(String str, String str2) {
        setType(str);
        setName(str2);
    }
}
