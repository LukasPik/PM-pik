import {Component} from '@angular/core';
import {Location} from '@angular/common';
import { ActivatedRoute, Params } from '@angular/router';

import {Medicine} from '../medicine'
import {MedicinesService} from '../medicines.service'

@Component({
  selector: 'app-medicine-add',
  templateUrl: './medicine-add.component.html',
  styleUrls:  ['./medicine-add.component.css']
})

export class MedicineAddComponent {
  med: Medicine;
  constructor(
    private medicinesService: MedicinesService,
    private route: ActivatedRoute,
    private location: Location
  ) {}


  add(name: String): void {
    this.medicinesService.addMedicine(name);
  }

  goBack(): void {
    this.location.back();
  }
}
