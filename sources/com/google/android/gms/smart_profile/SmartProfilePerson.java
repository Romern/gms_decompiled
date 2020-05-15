package com.google.android.gms.smart_profile;

import com.google.android.gms.people.identity.internal.models.PersonImpl;
import com.google.android.gms.people.identity.models.Person;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SmartProfilePerson extends PersonImpl {

    /* renamed from: J */
    public List f107754J;

    public SmartProfilePerson() {
    }

    public SmartProfilePerson(SmartProfilePerson smartProfilePerson, String str, String str2, String str3) {
        super(smartProfilePerson);
        List list = smartProfilePerson.f107754J;
        if (list != null && !list.isEmpty()) {
            this.f107754J = smartProfilePerson.f107754J;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        if (mo41006S()) {
            List list2 = this.f81758y;
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                Person.PhoneNumbers phoneNumbers = (Person.PhoneNumbers) list2.get(i);
                arrayList.add(new PersonImpl.PhoneNumbersImpl(phoneNumbers));
                hashSet.add(phoneNumbers.mo40985k());
            }
        }
        if (str != null && !hashSet.contains(str)) {
            PersonImpl.PhoneNumbersImpl phoneNumbersImpl = new PersonImpl.PhoneNumbersImpl();
            phoneNumbersImpl.f81891f = str;
            arrayList.add(phoneNumbersImpl);
        }
        this.f81758y = arrayList;
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet2 = new HashSet();
        if (mo41044o()) {
            List list3 = this.f81742i;
            int size2 = list3.size();
            for (int i2 = 0; i2 < size2; i2++) {
                Person.Emails emails = (Person.Emails) list3.get(i2);
                arrayList2.add(new PersonImpl.EmailsImpl(emails));
                hashSet2.add(emails.mo40923i());
            }
        }
        if (str2 != null && !hashSet2.contains(str2)) {
            PersonImpl.EmailsImpl emailsImpl = new PersonImpl.EmailsImpl();
            emailsImpl.f81795e = str2;
            emailsImpl.f81794d = str3;
            arrayList2.add(emailsImpl);
        }
        this.f81742i = arrayList2;
    }
}
